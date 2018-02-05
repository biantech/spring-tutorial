package com.biantech.spring4.hessian.provider;

import com.biantech.spring4.hessian.api.User;
import com.biantech.spring4.hessian.api.UserService;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * <code>UserServiceImpl</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findUserById(Long userId) {
        //mock data
        if(userId == 1){
            return new User(1l,"user",new Date());
        }
        return null;
    }
}
