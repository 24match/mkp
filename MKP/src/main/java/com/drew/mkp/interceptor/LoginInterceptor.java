package com.drew.mkp.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截
 * @author Liang
 * @Date 2020/3/9 10:51
 */
@Log4j2
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 预处理回调方法，实现处理器的预处理
     * @return true继续流程，false表示流程中断，不会调用其他的拦截器或处理器
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入拦截器的预处理回调方法");
        System.out.println(request.getContextPath());
        return false;
    }

    /**
     * 后处理的回调方法，实现controller的后处理，但是在渲染视图之前
     * 可以通过modelAndView对数据模型进行处理或对视图进行处理
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入拦截器的后处理的回调方法");
    }

    /**
     * 整个请求处理完毕回调方法，即在视图渲染完毕时回调，
     * 如性能监控中可以在此记录结束时间并输入消耗时间
     * 进行资源管理，类似于finally
     * 仅在调用处理器执行时
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("处理器执行时，进入请求处理完毕回调方法");
    }
}
