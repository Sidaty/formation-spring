/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring.endpoints;

import loga.test.formation.spring.HelloRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sidaty
 */
@RestController
@RequestMapping
public class TestEndPoint {
    
    @Autowired
    private HelloRunner helloRunner;
    
    @RequestMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
//        String name = "Aliou";s
        return helloRunner.sayHello(name);
    }
    
}
