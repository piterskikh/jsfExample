package com.piterskikh.jsf;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("example")
@SessionScoped
public class ExampleBean implements Serializable {

    private String name = "Привет Вася!!!!";

    public String getName() {
        return name;
    }
}
