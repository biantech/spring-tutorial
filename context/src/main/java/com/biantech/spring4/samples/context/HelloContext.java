package com.biantech.spring4.samples.context;

import com.biantech.spring4.samples.beans.HelloBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <code>HelloContext</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-16
 */
@Component
public class HelloContext extends HelloBean {

    private static final Logger LOG = LoggerFactory
            .getLogger(HelloContext.class);

    @Value("${desc}")
    private String desc;

    @Override
    @Value("${age}")
    public void setAge(Integer age) {
        super.setAge(age);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public void sayHello() {
        LOG.info("== [{}] ==hello my name = {} , age = {} , desc = {}", beanName,getName(),getAge(),getDesc());
    }
}
