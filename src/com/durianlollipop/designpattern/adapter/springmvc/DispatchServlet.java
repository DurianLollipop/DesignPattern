package com.durianlollipop.designpattern.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {

    private static final List<HandelAdapter> handelAdapters = new ArrayList<>();

    public DispatchServlet(){
        handelAdapters.add(new HttpHandelAdapter());
        handelAdapters.add(new SimpleHandelAdapter());
        handelAdapters.add(new AnnotationHandelAdapter());
    }

    void doDispatch(){
        //此处模拟SpringMvc从request取handel的对象，
        //适配器可以获取到希望的Controller
        HttpController controller = new HttpController();
        //AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();
        //得到对应的适配器
        HandelAdapter adapter = getHandel(controller);
        //通过适配器执行对应的Controller的对应的方法
        adapter.handel(controller);

    }

    private HandelAdapter getHandel(Controller controller) {
        return handelAdapters
                .stream()
                .filter(handelAdapter -> handelAdapter.supports(controller))
                .findAny()
                .get();
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }

}
