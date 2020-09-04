package com.prometheus;

import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class LambdaExample7 {

//    1. Vytvor si zoznam miest
//    2. zotriet zoznam
//    3. napis metodu, ktora vypise vsetko zo zoznamu miest
//    4. urob metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
//    5. nepouzivaj pri tom lambda

    public static void main(String[] args) {
        //    1. Vytvor si zoznam miest
        List <String> mesta = Arrays.asList(null, "Presov", "Levice", "Banska Stiavnica", "Liptovsky Trnovec");

        System.out.println("--------------------------------");
        //    3. napis metodu, ktora vypise vsetko zo zoznamu miest
        printWithFilter(mesta, s -> true, s -> System.out.println(s), wrapperFunction(s -> s.toUpperCase()));


    }

    private static void printWithFilter(List<String> mesta, Predicate<String> predicate,
                                        Consumer<String> consumer,
                                        Function<String, String> function) {
        for (String mesto : mesta){
            if (predicate.test(mesto)) {
                consumer.accept(function.apply(mesto));
            }
        }
    }

    private static void printMesta(List<String> mesta) {
        for (String mesto : mesta){
            System.out.println(mesto);
        }
    }

    interface Filter {
        boolean odFiltruj(String s);
    }

    private static  Function <String,String> wrapperFunction (Function<String,String> function){
        return s ->{
            try {
                function.apply(s);
            } catch (Exception e){
                //........
            }
            return s;
        };
    } // to co pride na vstup pojde aj na vystup// len to prezeniem cez wraper
}



