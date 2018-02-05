package com.biantech.spring4.samples.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <code>TimeLog</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-09-13
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeLog {
    String value();
}