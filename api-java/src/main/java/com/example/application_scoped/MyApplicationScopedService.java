package com.example.application_scoped;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
class MyApplicationScopedService {

    private int counter = 0;

    @PostConstruct
    void onConstructed() {
        System.out.println("@ApplicationScoped constructed");
    }

    int getAndIncrementCounter() {
        return counter++;
    }
}
