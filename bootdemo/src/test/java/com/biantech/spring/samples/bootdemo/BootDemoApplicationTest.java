package com.biantech.spring.samples.bootdemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * <code>BootDemoApplicationTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = {BootDemoApplication.class})
public class BootDemoApplicationTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(BootDemoApplicationTest.class);
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
    @Test
    public void testboot() throws Exception {
        ResultActions ac = mockMvc.perform(get("/demo/").accept(MediaType.ALL));
        ac.andExpect(status().isOk());
        ac.andDo(print());
    }
    @Test
    public void testListBean(){
        String[] beanDefinitionNames = wac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            LOG.info(beanDefinitionName);
        }
        LOG.info("size = {}",beanDefinitionNames.length);
    }
}