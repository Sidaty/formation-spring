/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author sidaty
 */
public class Test {

    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Sidaty", "Aliou", "Samietou", "Youssoufa");

        noms.stream().map(String::toUpperCase).filter(nom -> nom.length() > 5).forEach(System.out::println);

        List<String> nomss = noms.stream().map(String::toUpperCase).filter(nom -> nom.length() > 5).collect(Collectors.toList());

//        noms.stream()
//                .map(nom -> nom.toUpperCase())
//                .forEach(nom -> System.out.println(nom));

//        noms.forEach(nom -> {
//            String maj = nom.toUpperCase();
//            System.out.println(maj);
//        });
//        for (String nom : noms) {
//            String maj = nom.toUpperCase();
//            System.out.println(maj);
//        }
    }
}
