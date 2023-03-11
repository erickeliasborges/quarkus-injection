package com.example.singleton;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
class MySingletonService {

    private int counter = 0;

    @PostConstruct
    void onConstructed() {
        System.out.println("@Singleton constructed");
    }

    public int getAndIncrementCounter() {
        return counter++;
    }

}
