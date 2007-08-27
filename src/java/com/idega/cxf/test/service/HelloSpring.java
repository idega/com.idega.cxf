package com.idega.cxf.test.service;

import javax.jws.WebService;

import com.idega.business.SpringBeanName;

@SpringBeanName("helloSpringClient")
@WebService
public interface HelloSpring {

	public String sayHi(String text);
}