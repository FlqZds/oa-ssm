package org.sample.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
//@Component
public class controllerException {

    @ExceptionHandler(AppException.class)
    @ResponseBody
    public String appException(AppException runtimeException) {

        System.out.println("AppException发生了");
        return "err";
    }


    @ExceptionHandler(Exception.class)
//    @ResponseBody
    public String otherException(Exception e, HttpServletRequest request) {

        System.out.println("Exception发生了");
        request.setAttribute("e_msg",e.getMessage());
        return "err";
    }
}
