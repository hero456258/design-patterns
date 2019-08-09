package com.mingqian.adapter.springmvc;

/**
 * Created by mingqian on 2019/7/29.
 * 多种controller实现
 */
public interface Controller {

}

class HttpController implements Controller{
    public void doHttpHandler() {
        System.out.println("http...");
    }
}

class SimpleController implements Controller{
    public void doSimplerHandler() {
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler() {
        System.out.println("annotation...");
    }
}