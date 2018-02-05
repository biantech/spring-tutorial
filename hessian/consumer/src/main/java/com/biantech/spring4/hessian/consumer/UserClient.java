package com.biantech.spring4.hessian.consumer;

import com.biantech.spring4.hessian.api.User;
import com.biantech.spring4.hessian.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <code>UserClient</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
@Component
public class UserClient {

    @Autowired
    private UserService userService;

    public User findUserById(Long id){
        return userService.findUserById(id);
    }
}
