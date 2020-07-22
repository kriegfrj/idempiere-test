package org.idempiere.test.assertj;

import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;

// Dummy class to force Bnd to generate an import for RecursiveComparisonConfiguration
// (needed by generated soft assertions).
class Import {

	Class<?> importRecursive = RecursiveComparisonConfiguration.class;
	
}
