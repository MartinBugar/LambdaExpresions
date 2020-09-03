package com.prometheus;

public class LambdaExample4 {
    public static void main(String[] args) {
        Nasob nasobpiatimi = a -> a *5;
        printNasob(nasobpiatimi);
        printNasob(a -> a *5);
    }

    interface Nasob {
        int nasob(int a);
    }

    public static void printNasob(Nasob nasob){
        System.out.println(nasob.nasob(10));
    }
}
