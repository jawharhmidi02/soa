package com.jaxwsserver.ws;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.jaxwsserver.ws.Test")
public class TestImp implements Test {
    @Override
    public String HelloWorld() {
        return "Hello World!";
    }

    @Override
    public String Hello(String name) {
        return "Hello " + name + "!";
    }
}
