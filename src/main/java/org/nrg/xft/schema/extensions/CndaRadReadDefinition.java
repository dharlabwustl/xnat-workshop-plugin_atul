package org.nrg.xft.schema.extensions;

import org.nrg.xft.schema.DataModelDefinition;

public class CndaRadReadDefinition implements DataModelDefinition{
	@Override
	public String getSchemaPath() {
		return "schemas/radRead/radRead.xsd";
	}

	@Override
	public String[] getDisplayDocs() {
		return new String[]{"schemas/radRead/display/rad_radiologyReadData_display.xml"};
	}

	@Override
	public String[] getSecuredElements() {
		return new String[]{"rad:radiologyReadData"};
	}

	@Override
	public boolean required() {
		return false;
	}
}
