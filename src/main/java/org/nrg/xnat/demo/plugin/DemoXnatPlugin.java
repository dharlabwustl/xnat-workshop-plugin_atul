package org.nrg.xnat.demo.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.DemoBiosamplecollectionBean;
import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "demoPlugin", name = "Demo Plugin", entityPackages = "org.nrg.xnat.demo.entities",
            dataModels = {@XnatDataModel(value = DemoBiosamplecollectionBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Biosample Collection",
                                         plural = "Biosample Collections"),
                          @XnatDataModel(value = RadRadiologyreaddataBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Radiology Read",
                                         plural = "Radiology Reads")})
@ComponentScan({"org.nrg.xnat.demo.services.impl", "org.nrg.xnat.demo.repositories", "org.nrg.xnat.demo.rest"})
public class DemoXnatPlugin {
    @Bean
    public String demoPluginMessage() {
        return "Hello there from the demo plugin!";
    }
}
