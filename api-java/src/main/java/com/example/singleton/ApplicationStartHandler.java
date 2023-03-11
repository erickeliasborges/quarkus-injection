package com.example.singleton;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

class ApplicationStartHandler {

    // Quando um Singleton é injetado, ele já é criado quando a classe que possui a injeção é chamada, como exemplo abaixo
    // O Singleton funciona da mesma forma que o ApplicationScoped, só com a diferença de que não é lazy-loading e não tem proxy,
    // mas ele vai possuir apenas uma instância na aplicação, pode notar pelo método getAndIncrementCounter, no log irá aparecer
    // 0 e 1.

    @Inject
    MySingletonService mySingletonService; // MySingletonService gets initzialisied now

    @Inject
    MySingletonService mySecondSingletonService;

    void onApplicationStart(@Observes StartupEvent e) {
        System.out.println("Application started to Singleton test");

        System.out.println(mySingletonService.getAndIncrementCounter());
        System.out.println(mySecondSingletonService.getAndIncrementCounter());
    }

}
