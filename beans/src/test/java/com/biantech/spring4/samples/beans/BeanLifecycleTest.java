
package com.biantech.spring4.samples.beans;

import com.biantech.spring4.samples.beans.lifecycle.BeanPostProcessorAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * <code>BeanLifecycleTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-10-19
 */
public class BeanLifecycleTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(BeanLifecycleTest.class);

    /**
     * <code>testBeanLifecycle</code>
     *
     * 测试Bean生命周期
     * @author jonathan.bian
     * @since 1.0 2016-08-05
     */
    @Test
    public void testBeanLifecycle(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.addBeanPostProcessor(new BeanPostProcessorAdapter());
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        ClassPathResource resource = new ClassPathResource("spring/hello-bean.xml");
        beanDefinitionReader.loadBeanDefinitions(resource);
        LOG.info("beanFactory = {}",beanFactory );

        HelloBean bean = beanFactory.getBean("helloBean",HelloBean.class);
        org.junit.Assert.assertNotNull(bean);
        bean.sayHello();
        beanFactory.destroySingletons();
    }
}
