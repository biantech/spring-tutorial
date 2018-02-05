package com.biantech.spring.samples.mvcdemo.web;

import com.biantech.spring.samples.mvcdemo.model.DemoModel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * <code>RawOldController</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2014-11-27
 */
@org.springframework.stereotype.Controller("/rawOld")
public class RawOldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        DemoModel model = new DemoModel();
        model.setName("testName");
        model.setId(1l);
        model.setCreateTime(new Date());
        model.setLastModifiedTime(new Date());

        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrefixJson(false);
        view.setPrettyPrint(true);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("model",model);
        modelAndView.setView(view);

        return modelAndView;
    }
}
