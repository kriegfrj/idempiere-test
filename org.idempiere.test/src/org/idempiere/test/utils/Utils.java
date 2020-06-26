package org.idempiere.test.utils;

import static org.mockito.Mockito.mock;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.compiere.util.CLogger;

public class Utils {

	public static RuntimeException duck(Throwable t) {
		throwsUnchecked(t);
		throw new AssertionError("unreachable");
	}

	@SuppressWarnings("unchecked")
	private static <E extends Throwable> void throwsUnchecked(Throwable throwable) throws E {
		throw (E) throwable;
	}
	
	static final public BigDecimal BD_ZERO = BigDecimal.valueOf(0.0);
	static final public BigDecimal BD_ONE = BigDecimal.valueOf(1.0);
	static final public BigDecimal BD_TWO = BigDecimal.valueOf(2.0);
	static final public BigDecimal BD_TEN = BigDecimal.valueOf(10.0);
	static final public BigDecimal BD_THIRTYTHREE = BigDecimal.valueOf(33.0);
	static final public BigDecimal BD_FIFTY = BigDecimal.valueOf(50.0);
	static final public BigDecimal BD_ONEHUNDRED = BigDecimal.valueOf(100.0);
	static final public BigDecimal BD_TWOHUNDRED = BigDecimal.valueOf(200.0);

	public static Timestamp timestamp(String ts) {
		try {
			return parseTS(ts);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Bad date: " + ts, e);
		}
	}

	public static CLogger injectMockLog(Object object) {
		CLogger mockLog = mock(CLogger.class);
		try {
			setField(object, "log", mockLog);
		} catch (Exception e) {
			throw new IllegalArgumentException("Could not set log on object " + object, e);
		}
		return mockLog;
	}
	

	public static CLogger injectStaticMockLog(Class<?> clazz) {
		CLogger mockLog = mock(CLogger.class);
		try {
			setStaticField(clazz, "s_log", mockLog);
		} catch (Exception e) {
			throw new IllegalArgumentException("Could not set s_log on class " + clazz, e);
		}
		return mockLog;
	}
	
	public static void setField(Object o, String field, Object v) {
		try {
			Field f = getField(o.getClass(), field);
			f.setAccessible(true);
			f.set(o, v);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			throw new IllegalArgumentException("Prevented from setting field " + field, e);
		}
	}

	public static void setStaticField(Class<?> clazz, String field, Object v) {
		try {
			Field f = getField(clazz, field);
			f.setAccessible(true);
			f.set(null, v);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			throw new IllegalArgumentException("Prevented from setting static field " + field, e);
		}
	}

	public static Field getField(Class<?> clazz, String fieldName)
			throws NoSuchFieldException {
		try {
			return clazz.getDeclaredField(fieldName);
		} catch (NoSuchFieldException e) {
			Class<?> superClass = clazz.getSuperclass();
			if (superClass == null) {
				throw e;
			} else {
				return getField(superClass, fieldName);
			}
		}
	}

	public static <T> T getField(Object o, String fieldName) {
		try {
			Field f = getField(o.getClass(), fieldName);
			f.setAccessible(true);
			return (T)f.get(o);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			throw new IllegalArgumentException("Couldn't find field " + fieldName, e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <R, E extends Throwable> R invoke(Object object, String method) throws E {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		try {
			Method m = object.getClass().getDeclaredMethod(method);
			m.setAccessible(true);
			return (R)m.invoke(object);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException e) {
			throw new IllegalArgumentException("Couldn't execute method " + method, e);
		} catch (InvocationTargetException e) {
			throw (E)e.getTargetException();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <R, E extends Throwable> R invoke(Object object, String method, Class<?>[] parameterTypes, Object... args) throws E {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		try {
			Method m = object.getClass().getDeclaredMethod(method, parameterTypes);
			m.setAccessible(true);
			return (R)m.invoke(object, args);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException e) {
			throw new IllegalArgumentException("Couldn't execute method " + method, e);
		} catch (InvocationTargetException e) {
			throw (E)e.getTargetException();
		}
	}
	
	// Convenience method to turn human-readable string into seconds past epoch.
	public static long parseTSLong(String ts) throws ParseException {
	//			FMT.setTimeZone(TimeZone.getTimeZone("UTC"));
		return FMT.parse(ts).getTime();
	}

	public static Timestamp parseTS(String ts) throws ParseException {
		return ts == null ? null : new Timestamp(parseTSLong(ts));
	}

	public static DateFormat FMT = new SimpleDateFormat("yyyy-MM-dd");
}
