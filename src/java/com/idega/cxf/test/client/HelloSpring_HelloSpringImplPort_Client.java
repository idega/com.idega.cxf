
package com.idega.cxf.test.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by the CXF 2.0.1-incubator
 * Mon Aug 27 16:41:21 EEST 2007
 * Generated source version: 2.0.1-incubator
 * 
 */

public final class HelloSpring_HelloSpringImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.test.cxf.idega.com/", "HelloSpringImplService");

    private HelloSpring_HelloSpringImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {

    	
    	String u = "ws:/files/forms/submissions/?xman=1&lala=1";
    	
    	URI uri = new URI(u);
    	System.out.println("path: "+uri.getPath());
    	System.out.println("q: "+uri.getQuery());
//    	URL url = new URL(u);
    	
    	if(true)
    		return;
//        if (args.length == 0) { 
//            System.out.println("please specify wsdl");
//            System.exit(1); 
//        }
    	
    	args = new String[] {"http://localhost:8080/cxservices/HelloSpring?wsdl"};
        URL wsdlURL = null;
        File wsdlFile = new File(args[0]);
        try {
            if (wsdlFile.exists()) {
                wsdlURL = wsdlFile.toURL();
            } else {
                wsdlURL = new URL(args[0]);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
      
        HelloSpringImplService ss = new HelloSpringImplService(wsdlURL, SERVICE_NAME);
        HelloSpring port = ss.getHelloSpringImplPort();  
        
        System.out.println("Invoking sayHi...");
        java.lang.String _sayHi_arg0 = "";
        java.lang.String _sayHi__return = port.sayHi(_sayHi_arg0);
        System.out.println("sayHi.result=" + _sayHi__return);

        
        System.exit(0);
    }

}
