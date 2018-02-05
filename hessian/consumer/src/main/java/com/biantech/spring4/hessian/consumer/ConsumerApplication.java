/*
 * @project spring4-biantech
 * @package com.biantech.spring4.hessian.consumer
 * @file ConsumerApplication.java
 * @version  1.0
 * @author  jonathan.bian
 * @time 2016-08-29
 */
package com.biantech.spring4.hessian.consumer;

import com.biantech.spring4.hessian.api.UserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * <code>ConsumerApplication</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
@SpringBootApplication
public class ConsumerApplication {

    @Bean
    public HessianProxyFactoryBean userService(){
        HessianProxyFactoryBean factoryBean = new HessianProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8080/export/userService");
        factoryBean.setServiceInterface(UserService.class);
        return factoryBean;
    }
}
