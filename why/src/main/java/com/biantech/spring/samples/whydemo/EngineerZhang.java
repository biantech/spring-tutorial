package com.biantech.spring.samples.whydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>EngineerZhang</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-31
 */
public class EngineerZhang implements Engineer {

    private static final Logger LOG = LoggerFactory
            .getLogger(EngineerZhang.class);

    @Override
    public String getName() {
        return "程序猿张";
    }

    @Override
    public void goToWork() {
        LOG.info("这是 {}",getName());
        LOG.info("乘地铁上班");
    }
}
