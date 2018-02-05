
package com.biantech.spring.samples.whydemo;

/**
 * <code>TrafficTypeImpl</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-31
 */
public class TrafficTypeImpl implements TrafficType {

    private String trafficType = "步行";

    public TrafficTypeImpl() {
    }

    public TrafficTypeImpl(String trafficType) {
        this.trafficType = trafficType;
    }

    @Override
    public String trafficType() {
        return trafficType;
    }
}
