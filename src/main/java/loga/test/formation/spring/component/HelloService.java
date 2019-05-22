/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring.component;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author sidaty
 */
@Service
public class HelloService {
    
    @Value("${loga.language}")
    private String language;

    @Autowired
    private Date date;

    @Autowired
    private List<IHelloWorld> helloWorlds;

    
    public String sayHello(String name) {
        return sayHello(name, language);
    }

    public String sayHello(String name, String lg) {
        System.out.println("### language : " + lg);
        System.out.println("### Date : " + date);
        for (IHelloWorld helloWorld : helloWorlds) {
            if (!lg.equals(helloWorld.language())) {
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
