/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring.endpoints;

import loga.test.formation.spring.component.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sidaty
 */
@RestController
@RequestMapping("test2")
public class TestEndPoint2 {

    private final HelloService helloService;

    public TestEndPoint2(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("hello")
    public String sayHello(@RequestParam("n") String name, @RequestParam("lg") String lg) {
        return helloService.sayHello(name, lg);
    }

}
