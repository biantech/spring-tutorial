package com.biantech.spring4.hessian.provider;

import com.biantech.spring4.hessian.api.User;
import com.biantech.spring4.hessian.api.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * <code>UserServiceImplTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
public class UserServiceImplTest {
    private static final Logger LOG = LoggerFactory
            .getLogger(UserServiceImplTest.class);

    private UserService userService= new UserServiceImpl();
    @Test
    public void testFindUserById() throws Exception {
        User user = userService.findUserById(1l);
        assertNotNull(user);
        LOG.info("user = {}",user);
        assertEquals(user.getId(),Long.valueOf(1l));
    }
    @Test
    public void testFindUserById2() throws Exception {
        User user = userService.findUserById(0l);
        assertNull(user);
    }
}