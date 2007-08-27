package com.idega.cxf.test.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.idega.cxf.test.service.HelloSpring")
public class HelloSpringImpl implements HelloSpring {

	public String sayHi(String text) {
        return "Hello " + text;
    }
}