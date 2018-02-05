package com.biantech.spring4.samples.aop.advice;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <code>AopLogAdviceTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-09-13
 */
public class AopLogAdviceTest {

    @Test
    public void testAop() throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/aop_1.xml");

        context.publishEvent(new VoEvent("TEST"));

        Thread.sleep(1000000);
    }
}