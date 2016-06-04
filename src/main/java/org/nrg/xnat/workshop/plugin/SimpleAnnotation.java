package org.nrg.xnat.workshop.plugin;

public @interface SimpleAnnotation {
    int value() default 0;
    String name() default "";
}
