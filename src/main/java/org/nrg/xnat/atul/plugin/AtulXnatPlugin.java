/*
 * xnat-atul: org.nrg.xnat.atul.plugin.AtulXnatPlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.atul.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.AtulNwucollectionBean;
//import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "atulPlugin", name = "XNAT 1.7 Atul 2016 Plugin", entityPackages = "org.nrg.xnat.atul.entities",
            dataModels = {@XnatDataModel(value = AtulNwucollectionBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Nwu Collection",
                                         plural = "Nwu Collections")})
//                    ,
//                          @XnatDataModel(value = RadRadiologyreaddataBean.SCHEMA_ELEMENT_NAME,
//                                         singular = "Radiology Read",
//                                         plural = "Radiology Reads")})
@ComponentScan({"org.nrg.xnat.atul.subjectmapping.preferences",
        "org.nrg.xnat.atul.subjectmapping.repositories",
        "org.nrg.xnat.atul.subjectmapping.rest",
        "org.nrg.xnat.atul.subjectmapping.services.impl"})
public class AtulXnatPlugin {
    @Bean
    public String atulPluginMessage() {
        return "Hello there from the atul plugin!";
    }
}
