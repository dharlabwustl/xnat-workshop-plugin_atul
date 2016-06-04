package org.nrg.xnat.workshop.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.WorkshopBiosamplecollectionBean;
import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "workshopPlugin", name = "XNAT 1.7 Workshop 2016 Plugin", entityPackages = "org.nrg.xnat.workshop.entities",
            dataModels = {@XnatDataModel(value = WorkshopBiosamplecollectionBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Biosample Collection",
                                         plural = "Biosample Collections"),
                          @XnatDataModel(value = RadRadiologyreaddataBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Radiology Read",
                                         plural = "Radiology Reads")})
@ComponentScan({"org.nrg.xnat.workshop.services.impl", "org.nrg.xnat.workshop.repositories", "org.nrg.xnat.workshop.rest"})
public class WorkshopXnatPlugin {
    @Bean
    public String workshopPluginMessage() {
        return "Hello there from the workshop plugin!";
    }
}
