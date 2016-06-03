package org.nrg.xft.schema.extensions;

import org.nrg.xdat.bean.DemoBiosamplecollectionBean;
import org.nrg.xft.schema.DataModelDefinition;

@SuppressWarnings("unused")
public class DemoBiosampleCollection implements DataModelDefinition {
    @Override
    public String getSchemaPath() {
        return "schemas/demo/demo.xsd";
    }

    @Override
    public String[] getDisplayDocs() {
        return new String[] {"schemas/demo/display/demo_biosampleCollection_display.xml"};
    }

    @Override
    public String[] getSecuredElements() {
        return new String[] {DemoBiosamplecollectionBean.SCHEMA_ELEMENT_NAME};
    }

    @Override
    public boolean required() {
        return false;
    }
}
