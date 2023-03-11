package com.example.dependent;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class ApplicationStartHandler {

    // Com o dependent, cada injeção é criada e destruída na classe que o injeta, não possui instância única
    // pode notar pelo método getAndIncrementCounter, ao chamar nas duas injeções, ambos serão 0 e 0, pois
    // 2 instâncias são criadas

    @Inject
    MyDependentService firstDependentService; // MyDependentService gets initzialisied now

    @Inject
    MyDependentService secondDependentService; // MyDependentService gets initzialisied now

    void onApplicationStart(@Observes StartupEvent e) {
        System.out.println("Application started to Dependent test");

        System.out.println(firstDependentService.getAndIncrementCounter());
        System.out.println(secondDependentService.getAndIncrementCounter());
    }

}
