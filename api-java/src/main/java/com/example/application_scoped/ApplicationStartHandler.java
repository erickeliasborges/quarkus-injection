package com.example.application_scoped;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class ApplicationStartHandler {

    // Quando um ApplicationScoped é injetado, ele só é criado se for chamado algum método na classe que o injeta,
    // ele utiliza um cliente proxy que faz esse controle, o ApplicationScoped é criado como lazy-loading
    // como exemplo abaixo

    @Inject
    MyApplicationScopedService firstMyApplicationScopedService;

    @Inject
    MyApplicationScopedService secondMyApplicationScopedService;

    void onApplicationStart(@Observes StartupEvent e) {
        System.out.println("Application started to ApplicationScoped test");

        System.out.println(firstMyApplicationScopedService.getAndIncrementCounter()); // MyApplicationScopedService gets initzialisied now
        System.out.println(secondMyApplicationScopedService.getAndIncrementCounter());
    }

}
