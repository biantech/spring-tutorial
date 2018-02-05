
package com.biantech.spring4.samples.beans;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Properties;

/**
 * <code>BeanFactoryTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-15
 */
public class BeanFactoryTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(BeanFactoryTest.class);
    private void printBeans(ListableBeanFactory beanFactory) {
        StringBuilder sb =new StringBuilder("\n");
        for (String s : beanFactory.getBeanDefinitionNames()) {
            sb.append(s).append("\n");
        }
        LOG.info("beanNames = {}",sb.toString());
        LOG.info("beanNames.size = {}",beanFactory.getBeanDefinitionCount());
    }

    @Test
    public void testBeanFactoryXml(){
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        ClassPathResource resource = new ClassPathResource("spring/hello-bean.xml");
        beanDefinitionReader.loadBeanDefinitions(resource);

        HelloBean bean = beanFactory.getBean("helloBean",HelloBean.class);
        org.junit.Assert.assertNotNull(bean);
        bean.sayHello();

        HelloBean bean2 = beanFactory.getBean("helloBean2",HelloBean.class);
        org.junit.Assert.assertNotNull(bean2);
        bean2.sayHello();

        HelloBean bean3 = beanFactory.getBean("helloBean3",HelloBean.class);
        org.junit.Assert.assertNotNull(bean3);
        bean3.sayHello();

        printBeans((ListableBeanFactory) beanFactory);
    }

    @Test
    public void testBeanFactoryGroovy(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        GroovyBeanDefinitionReader beanDefinitionReader = new GroovyBeanDefinitionReader(beanFactory);
        ClassPathResource resource = new ClassPathResource("spring/helloBean.groovy");
        beanDefinitionReader.loadBeanDefinitions(resource);

        HelloBean bean = beanFactory.getBean(HelloBean.class);
        org.junit.Assert.assertNotNull(bean);
        bean.sayHello();
        LOG.info("beanFactory = {}",beanFactory );
    }


    @Test
    public void testProperties(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("spring/properties.xml"));
        LOG.info("beanFactory = {}",beanFactory );

        Properties settings = beanFactory.getBean("settings",Properties.class);
        LOG.info("settings = {}",settings);
        List list = beanFactory.getBean("placeHolderList",List.class);
        LOG.info("list = {}",list);

    }
    @Test
    public void testPlaceHolderXml(){
        //TODO placeHolder support xml
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        ClassPathResource resource = new ClassPathResource("spring/hello-bean.xml");
        beanDefinitionReader.loadBeanDefinitions(resource);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("spring/properties.xml"));

        Properties properties = new Properties();
        properties.setProperty("name","PropertiesNameValue");

        PreferencesPlaceholderConfigurer preferencesPlaceholderConfigurer = new PreferencesPlaceholderConfigurer();
        preferencesPlaceholderConfigurer.setProperties(properties);
        preferencesPlaceholderConfigurer.afterPropertiesSet();
        preferencesPlaceholderConfigurer.postProcessBeanFactory(beanFactory);

        LOG.info("beanFactory = {}",beanFactory );
        HelloBean bean4 = beanFactory.getBean("helloBean4",HelloBean.class);
        org.junit.Assert.assertNotNull(bean4);
        bean4.sayHello();

        List placeHolderList = beanFactory.getBean("placeHolderList", List.class);
        LOG.info("placeHolderList = {}",placeHolderList);
    }
    @Test
    @Deprecated
    public void testPlaceHolderAnnotation(){
        //
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        ClassPathResource resource = new ClassPathResource("spring/hello-bean.xml");
        beanDefinitionReader.loadBeanDefinitions(resource);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("spring/properties.xml"));

        AutowiredAnnotationBeanPostProcessor beanPostProcessor = new AutowiredAnnotationBeanPostProcessor();
        beanPostProcessor.setBeanFactory(beanFactory);
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        LOG.info("beanFactory = {}",beanFactory );
        HelloBean bean3 = beanFactory.getBean("helloBean3",HelloBean.class);
        org.junit.Assert.assertNotNull(bean3);
        bean3.sayHello();
        HelloBean bean4 = beanFactory.getBean("helloBean4",HelloBean.class);
        org.junit.Assert.assertNotNull(bean4);
        bean4.sayHello();
    }
}
