package org.example;

import org.springframework.stereotype.Component;

//For Component Stereotyping
//@Component
public class Parrot {
    //private String name ="Bhumi";

    //For IOC Configuration
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot() {
    }
}

