package com.biantech.spring4.samples.aop;

import com.biantech.spring4.samples.aop.aspect.AopLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <code>AopLogTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {HelloServiceImpl.class,AopLog.class,AopConfig.class})
@EnableAspectJAutoProxy
public class AopLogTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(AopLogTest.class);
    @Autowired
    private HelloService helloService;
    @Test
    public void testsaySomething(){
        LOG.info("=======start");
        helloService.saySomething("tom");
        LOG.info("=======end");
    }

   @Test
    public void testchatting(){
        LOG.info("=======start");
        helloService.chatting("tom");
        LOG.info("=======end");
    }

}
