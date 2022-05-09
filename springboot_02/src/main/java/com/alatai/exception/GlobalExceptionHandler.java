package com.alatai.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/15 22:36
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception exp) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", exp);
        mv.addObject("url", req.getRequestURL());

        mv.setViewName("errorPage");

        return mv;
    }

}
