package org.idempiere.test;

import org.compiere.Adempiere;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		Adempiere.startup(false);
		// This is just to force the event manager to start.
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
