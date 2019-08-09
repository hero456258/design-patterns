package com.mingqian.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingqian on 2019/7/29.
 */
public class DispatchServlet {


    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        //此处模拟SpringMVC从request获取handler对象
        //适配器可以获取到希望的Controller
        HttpController controller = new HttpController();
//        AnnotationController controller = new AnnotationController();
//        SimpleController controller = new SimpleController();
        //得到对应的适配器
        HandlerAdapter adapter = getHandler(controller);
        //通过适配器执行对应的controller对应方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        //遍历：根据得到的controller(handler), 返回对应适配器
        for (HandlerAdapter adapter : this.handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
        /**
         * 运行结果：
         *      http...
         */
    }
}
