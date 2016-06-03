package org.nrg.xnat.demo.plugin;

import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "subjectMappingPlugin", name = "Subject Mapping Plugin", entityPackages = "org.nrg.xnat.demo.entities")
@ComponentScan({"org.nrg.xnat.demo.services.impl", "org.nrg.xnat.demo.repositories", "org.nrg.xnat.demo.rest"})
public class SubjectMappingXnatPlugin {
    @Bean
    public String subjectMappingPluginMessage() {
        return "Hello there from the subject mapping plugin!";
    }
}
