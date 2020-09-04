package com.prometheus;

import com.prometheus.models.Osoba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewIteration {
    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Martin0", "Bugar", 55),
                new Osoba("Martin1", "Bugar", 55),
                new Osoba("Martin2", "Bugar", 55),
                new Osoba("Martin3", "Bugar", 55)
        );

        for (int i = 0; i < osoby.size();i++){
            System.out.println(osoby.get(i).getMeno());
        }

        for (Osoba osoba : osoby){
            System.out.println(osoba.getMeno());
        }

        osoby.forEach(osoba -> System.out.println(osoba.getMeno()));
        osoby.forEach(System.out::println);

    }
}
