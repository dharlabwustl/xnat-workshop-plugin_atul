package org.nrg.xnat.demo.plugin;

public @interface SimpleAnnotation {
    int value() default 0;
    String name() default "";
}
