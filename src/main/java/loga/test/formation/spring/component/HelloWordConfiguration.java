/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga.test.formation.spring.component;

import java.util.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sidaty
 */
@Configuration
public class HelloWordConfiguration {
    
    @Bean
    public Date getDate() {
        return new Date();
    }
    
    
    @Bean IHelloWorld helloWorldHaoussa() {
        return new IHelloWorld() {
            @Override
            public String sayHello(String name) {
                return "Barka " + name;
            }

            @Override
            public String language() {
                return "hs";
            }
        };
    }
}
