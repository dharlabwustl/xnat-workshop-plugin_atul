package org.nrg.xnat.workshop2016.plugin;

import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "workshopAttendeePlugin", name = "Workshop Attendee Plugin", entityPackages = "org.nrg.xnat.workshop2016.entities")
@ComponentScan({"org.nrg.xnat.workshop2016.services.impl", "org.nrg.xnat.workshop2016.repositories", "org.nrg.xnat.workshop2016.rest"})
public class WorkshopAttendeeXnatPlugin {
    @Bean
    public String workshopAttendeePluginMessage() {
        return "Hello there from the workshop attendee plugin!";
    }
}
