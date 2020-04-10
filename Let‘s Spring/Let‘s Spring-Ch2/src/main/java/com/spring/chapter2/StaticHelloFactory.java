package com.spring.chapter2;

public class StaticHelloFactory {

    public static HelloWorld GiveMeAHelloWord(){
        return new HelloWorldImpl();
    }
}
