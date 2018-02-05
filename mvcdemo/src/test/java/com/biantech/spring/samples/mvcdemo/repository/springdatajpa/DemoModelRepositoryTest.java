package com.biantech.spring.samples.mvcdemo.repository.springdatajpa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <code>DemoModelRepositoryTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@SpringApplicationConfiguration(locations = {"classpath:spring/druid.xml","classpath:spring/property.xml"})
public class DemoModelRepositoryTest {

//    @Resource
//    private DemoModelRepository demoModelRepository;
    @Before
    public void init(){

    }
    @Test
    public void test(){

    }
//    @Test
//    public void testSelect(){
//        demoModelRepository.findAll();
//    }
//    @Test
//    public void testSave(){
//        DemoModel demoModel = new DemoModel();
//        demoModel.setName("test");
//        demoModel.setDescription("test");
//        demoModel.setCreateTime(new Date());
//        demoModel.setLastModifiedTime(new Date());
//        demoModelRepository.save(demoModel);
//    }
}