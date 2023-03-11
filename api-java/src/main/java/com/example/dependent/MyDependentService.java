package com.example.dependent;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

@Dependent
public class MyDependentService {

    private int counter = 0;

    @PostConstruct
    public void onConstructed() {
        System.out.println("@Dependent constructed");
    }

    public int getAndIncrementCounter() {
        return counter++;
    }

}
