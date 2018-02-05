package com.biantech.spring.samples.whydemo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <code>EngineerBySpringTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-10-19
 */
public class EngineerBySpringTest {

    @Test
    public void testEngineerAnyBySpringXml(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/beans.xml");

        Engineer engineerAny = applicationContext.getBean("engineerAny", Engineer.class);
        engineerAny.goToWork();
        Assert.assertEquals(engineerAny.getName(),"配置攻城狮");
    }

}
