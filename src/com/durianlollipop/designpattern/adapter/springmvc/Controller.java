package com.durianlollipop.designpattern.adapter.springmvc;

//多种Controller实现
public interface Controller {
}

class HttpController implements Controller{

    void doHttpHandel(){
        System.out.println("Http...");
    }

}

class SimpleController implements Controller{

    void doSimpleHandel(){
        System.out.println("Simple...");
    }

}

class AnnotationController implements Controller{

    void doAnnotationHandel(){
        System.out.println("Annotation...");
    }

}