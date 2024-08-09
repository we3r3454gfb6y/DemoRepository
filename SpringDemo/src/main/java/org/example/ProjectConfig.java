package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    //For default bean selection
    //@Primary
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Parrot");
        return p;
    }

    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Dodo");
        return p;
    }

    @Bean
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }
}
