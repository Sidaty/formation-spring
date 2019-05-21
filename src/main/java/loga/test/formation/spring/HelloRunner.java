/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring;

import loga.test.formation.spring.component.HelloWorldEn;
import loga.test.formation.spring.component.HelloWorldEs;
import loga.test.formation.spring.component.HelloWorldFr;
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
    private HelloWorldFr helloWorldFr;
    @Autowired
    private HelloWorldEn helloWorldEn;
//    @Autowired
//    private HelloWorldEs helloWorldEs;
    
    
    @Autowired
    private IHelloWorld helloWorldEs;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("### language : " + language);
        String message;
        if("en".equals(language)){
            message = helloWorldEn.sayHello("Samietou");
        } else if("es".equals(language)){
            message = helloWorldEs.sayHello("Samietou");
        } else if("fr".equals(language)){
            message = helloWorldFr.sayHello("Samietou");
        } else {
            message = "Je ne sais pas";
        }
        System.out.println("####### " + message);
    }

}
