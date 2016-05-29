package org.nrg.xnat.workshop2016.plugin;

public @interface SimpleAnnotation {
    int value() default 0;
    String name() default "";
}
