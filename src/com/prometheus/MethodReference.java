package com.prometheus;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {

        doSomething("Martin", System.out::println);
        sumIt(10,20, (a,b)-> System.out.println(a+b));
        sumIt(10,20, UtilClass::sumIt);
    }

    public static <T> void doSomething(T item, Consumer<T> consumer) {
        consumer.accept(item);
    }

    public static void sumIt(int a, int b, BiConsumer<Integer, Integer> biConsumer){
        biConsumer.accept(a,b);
    }
}
