package io.dracula.test.guice.github.example.impl;

import io.dracula.test.guice.github.example.HelloService;

import javax.inject.Singleton;

@Singleton
public class HelloServiceImpl implements HelloService {

    @Override
    public void print() {
        System.out.println(this);
    }

}
