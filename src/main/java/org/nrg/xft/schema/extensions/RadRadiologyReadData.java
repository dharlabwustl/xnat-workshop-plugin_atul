package org.nrg.xft.schema.extensions;

import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.nrg.xft.schema.DataModelDefinition;

@SuppressWarnings("unused")
public class RadRadiologyReadData implements DataModelDefinition {
    @Override
    public String getSchemaPath() {
        return "schemas/radRead/radRead.xsd";
    }

    @Override
    public String[] getDisplayDocs() {
        return new String[] {"schemas/radRead/display/rad_radiologyReadData_display.xml"};
    }

    @Override
    public String[] getSecuredElements() {
        return new String[] {RadRadiologyreaddataBean.SCHEMA_ELEMENT_NAME};
    }

    @Override
    public boolean required() {
        return false;
    }
}
