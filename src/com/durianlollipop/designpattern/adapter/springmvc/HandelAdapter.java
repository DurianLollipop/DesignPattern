package com.durianlollipop.designpattern.adapter.springmvc;

public interface HandelAdapter {

    boolean supports(Object handel);

    void handel(Object handel);

}

class HttpHandelAdapter implements HandelAdapter{

    @Override
    public boolean supports(Object handel) {
        return handel instanceof HttpController;
    }

    @Override
    public void handel(Object handel) {
            ((HttpController) handel).doHttpHandel();
    }
}

class SimpleHandelAdapter implements HandelAdapter{

    @Override
    public boolean supports(Object handel) {
        return handel instanceof SimpleHandelAdapter;
    }

    @Override
    public void handel(Object handel) {
        ((SimpleController) handel).doSimpleHandel();
    }
}

class AnnotationHandelAdapter implements HandelAdapter{

    @Override
    public boolean supports(Object handel) {
        return handel instanceof AnnotationController;
    }

    @Override
    public void handel(Object handel) {
        ((AnnotationController) handel).doAnnotationHandel();
    }
}