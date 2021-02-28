package io.dracula.test.guice.github.example.impl;

import io.dracula.test.guice.github.example.BillingService;
import io.dracula.test.guice.github.example.TransferService;

import javax.inject.Inject;

public class BillingServiceImpl implements BillingService {

    @Inject
    TransferService transferService;

    @Override
    public void print() {
        System.out.println(transferService);
        System.out.println(this);
    }

}
