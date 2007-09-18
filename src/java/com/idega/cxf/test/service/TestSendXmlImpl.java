package com.idega.cxf.test.service;

import javax.jws.WebService;

import org.w3c.dom.Node;

@WebService(endpointInterface = "com.idega.cxf.test.service.TestSendXml")
public class TestSendXmlImpl implements TestSendXml {

	public String sayHi(Node instance) {
		
        return "Hello instance.. "+instance;
    }
}