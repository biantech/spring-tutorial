package com.biantech.spring4.hessian.consumer;

import com.biantech.spring4.hessian.api.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * <code>UserClientTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
@IntegrationTest
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {ConsumerApplication.class,UserClient.class})
@SpringApplicationConfiguration(classes = {ConsumerApplication.class})
public class UserClientTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(UserClientTest.class);
    @Autowired
    private UserClient userClient;
    @Test
    public void testFindUserById() throws Exception {
        User user = userClient.findUserById(1l);
        assertNotNull(user);
        LOG.info("user = {}",user);
        assertEquals(user.getId(),Long.valueOf(1l));
    }
    @Test
    public void testFindUserById2() throws Exception {
        User user = userClient.findUserById(0l);
        assertNull(user);
    }
}