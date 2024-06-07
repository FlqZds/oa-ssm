package org.sample.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myInterceptor implements HandlerInterceptor {
//      返回false就不进入controller，阻止该次请求
//    一般多用于做权限校验，进入controller之前执行
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        System.out.println("现已拦截请求，地址为进入DispatcherServlet之后，handler执行之前");
        return true;
    }

//    controller执行完出来以后
//  这个时候 modelandview 刚刚被创建出来，还没有被视图解析器解析，所以这个时候程序员还有机会改变返回给前端的值
//  如果controller 抛出异常 就不会走到这个方法当中
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.err.println("现已拦截请求，地址为controller执行之后，modelAndView渲染之前");
        if (modelAndView != null&& modelAndView.getModelMap().get("s")!= null){
            System.out.println("这是我拦截的东西：");
        }else {
            System.out.println("modelAndView 为null");
        }
    }

    // 这个也是从controller 出来之后，但是modelandview 已经被解析了
    // 所以这个时候修改modelandview 已经晚了
    // controller 不管跑不跑出异常  都会进入这个方法
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
