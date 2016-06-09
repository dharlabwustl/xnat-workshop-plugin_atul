package org.nrg.xnat.workshop.subjectmapping.preferences;

import org.nrg.prefs.annotations.NrgPreference;
import org.nrg.prefs.annotations.NrgPreferenceBean;
import org.nrg.prefs.beans.AbstractPreferenceBean;
import org.nrg.prefs.exceptions.InvalidPreferenceName;

import java.util.List;

@NrgPreferenceBean(toolId = "subjectMapping", toolName = "XNAT Subject Mapping Plugin")
public class SubjectMappingPreferencesBean extends AbstractPreferenceBean {

    @NrgPreference
    public List<String> getSourceSystemIds() {
        return getListValue("sourceSystemIds");
    }

    public void setSourceSystemIds(final List<String> sourceSystemIds) {
        try {
            setListValue("sourceSystemIds", sourceSystemIds);
        } catch (InvalidPreferenceName invalidPreferenceName) {
            //
        }
    }
}
