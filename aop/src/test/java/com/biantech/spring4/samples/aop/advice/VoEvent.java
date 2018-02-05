package com.biantech.spring4.samples.aop.advice;

import org.springframework.context.ApplicationEvent;

/**
 * <code>VoEvent</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-09-13
 */
public class VoEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public VoEvent(Object source) {
        super(source);
    }
}
