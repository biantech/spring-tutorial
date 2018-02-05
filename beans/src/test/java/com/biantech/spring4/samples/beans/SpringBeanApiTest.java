package com.biantech.spring4.samples.beans;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.InstantiationStrategy;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.beans.PropertyEditor;

/**
 * <code>SpringBeanApiTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-18
 */
public class SpringBeanApiTest {

    BeanDefinition beanDefinition;

    BeanDefinitionRegistry beanDefinitionRegistry;

    BeanDefinitionReader beanDefinitionReader;

    BeanFactoryPostProcessor beanFactoryPostProcessor;

    InstantiationStrategy instantiationStrategy;

    BeanWrapper beanWrapper;

//    PropertyEditor propertyEditor;

    PropertiesEditor propertiesEditor;
}
