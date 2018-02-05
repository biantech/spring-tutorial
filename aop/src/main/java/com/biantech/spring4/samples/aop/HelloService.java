package com.biantech.spring4.samples.aop;

/**
 * <code>HelloService</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-19
 */
public interface HelloService {

    public String sayHello(String user);
    public String saySomething(String user);
    public String chatting(String user);
    public String sayBye(String user);
}
