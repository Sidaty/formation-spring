/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring.component;

import org.springframework.stereotype.Component;

/**
 *
 * @author sidaty
 */
@Component
public class HelloWorldEs implements IHelloWorld {

    @Override
    public String language() {
        return "es";
    }
    
    @Override
    public String sayHello(String name) {
        return "Holla " + name;
    }
    
    
}
