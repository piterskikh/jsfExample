package com.piterskikh.jsf;


import javax.inject.Named;

@Named
public class ExampleBean {

    private String name = "Привет Вася!!!!";

    public String getName() {
        return name;
    }
}
