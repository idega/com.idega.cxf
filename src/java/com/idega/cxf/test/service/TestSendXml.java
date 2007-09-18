package com.idega.cxf.test.service;

import javax.jws.WebService;

import org.w3c.dom.Node;

import com.idega.business.SpringBeanName;

@SpringBeanName("testSendXml")
@WebService
public interface TestSendXml {

	public String sayHi(Node instance);
}