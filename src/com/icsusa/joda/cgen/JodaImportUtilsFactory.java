package com.icsusa.joda.cgen;

import org.apache.cayenne.gen.DefaultToolsUtilsFactory;
import org.apache.cayenne.gen.ImportUtils;

/**
 * unused
 */
public class JodaImportUtilsFactory extends DefaultToolsUtilsFactory {

	@Override
	public ImportUtils createImportUtils() {
		return new JodaImportUtils();
	}
	
}
