package org.nrg.xft.schema.extensions;

import org.nrg.xft.schema.DataModelDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CndaRadReadDefinition implements DataModelDefinition{
	@Override
	public String getSchemaPath() {
        _log.error("Getting the schema path");
		return "schemas/radRead/radRead.xsd";
	}

	@Override
	public String[] getDisplayDocs() {
        _log.error("Getting the display docs");
        return new String[]{"schemas/radRead/display/rad_radiologyReadData_display.xml"};
	}

	@Override
	public String[] getSecuredElements() {
        _log.error("Getting the secured elements");
        return new String[]{"rad:radiologyReadData"};
	}

	@Override
	public boolean required() {
		_log.error("Getting the required property");return false;
	}

	private static final Logger _log = LoggerFactory.getLogger(CndaRadReadDefinition.class);
}
