package com.nitro;


import org.springframework.stereotype.Component;

@Component
public class HeloWorld {
    String hello;

    public HeloWorld() {
    }

    public HeloWorld(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
