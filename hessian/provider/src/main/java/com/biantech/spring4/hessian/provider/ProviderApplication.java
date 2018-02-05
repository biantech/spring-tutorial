package com.biantech.spring4.hessian.provider;

import com.biantech.spring4.hessian.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * <code>ProviderApplication</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
@SpringBootApplication
public class ProviderApplication {

    @Autowired
    private UserService userService;

    @Bean(name="/export/userService")
    public HessianServiceExporter userService(){
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(userService);
        exporter.setServiceInterface(UserService.class);
        return exporter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
