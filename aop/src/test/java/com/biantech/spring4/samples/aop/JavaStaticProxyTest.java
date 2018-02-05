package com.biantech.spring4.samples.aop;

import com.biantech.spring4.samples.aop.proxy.JavaStaticProxy;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>JavaStaticProxyTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-06-05
 */
public class JavaStaticProxyTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(JavaStaticProxyTest.class);

    @Test
    public void testChatting(){
        HelloService helloServiceTarget = new HelloServiceImpl();
        HelloService helloServiceProxy = new JavaStaticProxy(helloServiceTarget);
        LOG.info("=======start");
        helloServiceProxy.chatting("tom");
        LOG.info("=======end");
    }
}