package com.mingqian.adapter.springmvc;

/**
 * Created by mingqian on 2019/7/29.
 * 定义一个适配器接口
 */
public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handle(Object handler);
}

/**
 * 多种适配器类
 */
class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimplerHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }
    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}


class AnnotationHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}