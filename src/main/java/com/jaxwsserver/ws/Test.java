package com.jaxwsserver.ws;

import jakarta.jws.WebService;

@WebService
public interface Test {
    public String HelloWorld();

    public String Hello(String name);

}
