package com.jaxwsserver;

import com.jaxwsserver.ws.TestImp;
import jakarta.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        TestImp test = new TestImp();

        Endpoint.publish("http://localhost:5000/ws/test", test);

        System.out.println(test.HelloWorld());
        System.out.println(test.Hello("Faten"));
    }
}
