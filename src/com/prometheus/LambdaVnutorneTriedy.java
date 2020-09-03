package com.prometheus;

public class LambdaVnutorneTriedy {


    public static void main(String[] args) {


    LambdaIntf lambdaIntf =  () -> System.out.println("Hello World from inner class");






        LambdaIntf lambdaIntf2 = new LambdaIntf() {
            @Override
            public void print() {
                System.out.println("Hello World from inner class2");
            }
        };

    lambdaIntf.print();
    printIt(lambdaIntf);
        printIt(lambdaIntf2);
        printIt(() -> System.out.println("Hello World from inner class"));


    }

    public static void printIt(LambdaIntf lambdaIntf){
            lambdaIntf.print();
    }


}
