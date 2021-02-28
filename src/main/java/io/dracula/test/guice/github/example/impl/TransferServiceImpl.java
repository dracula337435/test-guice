package io.dracula.test.guice.github.example.impl;

import io.dracula.test.guice.github.example.TransferService;

import javax.inject.Singleton;

@Singleton
public class TransferServiceImpl implements TransferService {

    @Override
    public void print() {
        System.out.println(this);
    }

}
