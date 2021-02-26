package io.dracula.test.guice.github.example.impl;

import io.dracula.test.guice.github.example.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void print() {
        System.out.println(this);
    }

}
