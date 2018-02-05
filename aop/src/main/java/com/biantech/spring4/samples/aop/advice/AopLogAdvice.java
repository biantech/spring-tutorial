package com.biantech.spring4.samples.aop.advice;

import com.biantech.spring4.samples.aop.annotation.TimeLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>AopLogAdvice</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-09-13
 */
public class AopLogAdvice {
    private static final Logger LOG = LoggerFactory
            .getLogger(AopLogAdvice.class);

    public Object doAround(ProceedingJoinPoint jp)  throws Throwable{
        String className = jp.getTarget().getClass().getName();
        @SuppressWarnings("checked")
        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
        String methodName = methodSignature.getName();
        TimeLog timeLog = methodSignature.getMethod().getAnnotation(TimeLog.class);
        LOG.info("methodName = {}",methodName);
        LOG.info("timeLog = {}",timeLog);
        Object result = null;
        try {
            result = jp.proceed();
        }catch (Exception e){
            throw e;
        }
        return result;
    }
}
