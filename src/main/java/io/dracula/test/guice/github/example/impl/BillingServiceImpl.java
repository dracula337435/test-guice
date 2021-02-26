package io.dracula.test.guice.github.example.impl;

import io.dracula.test.guice.github.example.BillingService;
import io.dracula.test.guice.github.example.HelloService;

import javax.inject.Inject;

public class BillingServiceImpl implements BillingService {

    @Inject
    HelloService helloService;

    @Override
    public void print() {
        System.out.println(helloService);
        System.out.println(this);
    }

}
