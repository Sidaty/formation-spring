/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring;

import java.util.Date;
import java.util.List;
import loga.test.formation.spring.component.IHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author sidaty
 */
@Component
public class HelloRunner implements CommandLineRunner {

    @Value("${loga.language}")
    private String language;

    @Autowired
    private Date date;

    @Autowired
    private List<IHelloWorld> helloWorlds;

    @Override
    public void run(String... args) throws Exception {
        String name = "Samietou";
        System.out.println("################");

        String mes = sayHello(name);
        System.out.println(mes);
    }

    public String sayHello(String name) {
        System.out.println("### language : " + language);
        System.out.println("### Date : " + date);
        for (IHelloWorld helloWorld : helloWorlds) {
            if (!language.equals(helloWorld.language())) {
                continue;
            }
            return helloWorld.sayHello(name);
        }

        return "inconnue";

//        helloWorlds
//                .stream()
//                .map(helloWord -> helloWord.sayHello(name))
//                .forEach(System.out::println);
    }

}
