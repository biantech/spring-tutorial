package com.biantech.spring.samples.whydemo;

/**
 * <code>GoToWorkSubway</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-31
 */
public class SubwayType implements TrafficType {
    @Override
    public String trafficType() {
        return "乘地铁";
    }
}
