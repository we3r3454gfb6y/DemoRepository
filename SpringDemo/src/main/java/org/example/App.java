package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Component Scan
//@ComponentScan(basePackages = "main")
public class App 
{
    public static void main( String[] args )
    {
        //For Component Scan
        /*
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Parrot.class);
        Parrot bean = context.getBean(Parrot.class);
        System.out.println(bean);
        */

        //For IOC Configuration File
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot bean = context.getBean(Parrot.class);
        System.out.println(bean);

    }
}


