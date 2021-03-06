package com.biantech.spring.samples.mvcdemo.web;

import com.biantech.spring.samples.mvcdemo.support.PlaintStringView;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <code>WelcomeController</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2014-12-04
 */
@org.springframework.stereotype.Controller("/welcome")
public class WelcomeController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String plaint = "Welcome to here,enjoy spring mvc 分享 !";
        PlaintStringView view = new PlaintStringView(plaint);
        modelAndView.setView(view);
        return modelAndView;
    }
}
