package com.prometheus;

public class HelloWorld {
    public void printHelloWorld(){
        System.out.println("Hello World");
    }

    public void printHelloWorld2 (HelloWorldFunctions helloWorldFunctions){
        helloWorldFunctions.sayHello();
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printHelloWorld();

        helloWorld.printHelloWorld2(helloWorld.new HelloWorldC());
        helloWorld.printHelloWorld2(() -> System.out.println("Hello world impls"));

    }

    class HelloWorldC implements HelloWorldFunctions{

        @Override
        public void sayHello() {
            System.out.println("Hello World");
        }
    }
}
