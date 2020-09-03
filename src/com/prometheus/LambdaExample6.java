package com.prometheus;




import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class LambdaExample6 {

//    1. Vytvor si zoznam miest
//    2. zotriet zoznam
//    3. napis metodu, ktora vypise vsetko zo zoznamu miest
//    4. urob metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
//    5. nepouzivaj pri tom lambda

    public static void main(String[] args) {
        //    1. Vytvor si zoznam miest
        List <String> mesta = Arrays.asList("Banska Bystrica", "Presov", "Levice", "Banska Stiavnica", "Liptovsky Trnovec");

        //    2. zotriet zoznam
        Collections.sort(mesta, ( o1,  o2) -> o1.compareTo(o2));

        System.out.println("--------------------------------");
        //    3. napis metodu, ktora vypise vsetko zo zoznamu miest
        printWithFilter(mesta, s -> true, s -> System.out.println(s));


        System.out.println("--------------------------------");
        //    4. urob metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
        printWithFilter(mesta, s -> !s.contains(" "),s -> System.out.println(s));

        System.out.println("--------------------------------");
        printWithFilter(mesta, s -> s.startsWith("B"),s -> System.out.println(s));

    }

    private static void printWithFilter(List<String> mesta, Predicate<String> predicate, Consumer<String> consumer) {
        for (String mesto : mesta){
            if (predicate.test(mesto)) {
                consumer.accept(mesto);
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
}


