package com.biantech.spring4.samples.aop.advice;

import com.biantech.spring4.samples.aop.annotation.TimeLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

/**
 * <code>ApplicationEventListener</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-09-13
 */
public class ApplicationEventListener implements ApplicationListener<VoEvent> {

    private static final Logger LOG = LoggerFactory
            .getLogger(ApplicationEventListener.class);
    @Async("qmqExecutor")
    @TimeLog("T")
    @Override
    public void onApplicationEvent(VoEvent event) {
        LOG.info("event = {}",event);
    }
}
