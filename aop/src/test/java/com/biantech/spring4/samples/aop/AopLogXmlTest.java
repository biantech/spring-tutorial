package com.biantech.spring4.samples.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <code>AopLogXmlTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(locations =  {"classpath:/spring/aop.xml"})
public class AopLogXmlTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(AopLogTest.class);
    @Autowired
    private HelloProvider helloService;
    @Test
    public void testsaySomething(){
        LOG.info("=======start");
        helloService.saySomething("tom");
        LOG.info("=======end");
    }
    @Test
    public void testHello(){
        LOG.info("=======start");
        helloService.sayHello("tom");
        LOG.info("=======end");
    }
    @Test
    public void testchatting(){
        LOG.info("=======start");
        helloService.chatting("tom");
        LOG.info("=======end");
    }

    /**
     * 侵入性的代码支持 内部调用aop
     */
    @Test
    public void testchattingAop(){
        LOG.info("=======start");
        helloService.chattingAop("tom");
        LOG.info("=======end");
    }

}
