package com.idega.cxf.test.service;

import java.io.ByteArrayInputStream;

import javax.jws.WebService;

@WebService(endpointInterface = "com.idega.cxf.test.service.HelloSpring")
public class HelloSpringImpl implements HelloSpring {

	public String sayHi(String text) {
        return "Hello " + text;
    }
	
	public String sendNode(byte[] node) {

		System.out.println("send Node called");
		
		try {
			
			/*ByteArrayInputStream is =*/ new ByteArrayInputStream(node);
			//Document doc = DOMUtils.readXml(is);
//			System.out.println("doc: "+doc);
//			System.out.println("fword: "+doc.getDocumentElement().getNodeName());
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Node got: "+node;
	}
}