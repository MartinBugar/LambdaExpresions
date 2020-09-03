package com.prometheus;

public class HelloWorld2 {


    public void printHelloWorld2(LambdaIntf printHello){
        printHello.print();
    }

    public static void main(String[] args) {
        LambdaIntf printHellooo =  () -> System.out.println("Hello World");

        HelloWorld2 helloWorld2 = new HelloWorld2();
        helloWorld2.printHelloWorld2(printHellooo);
    }
}
