
package com.idega.cxf.test.client;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the CXF 2.0.1-incubator
 * Mon Aug 27 16:41:21 EEST 2007
 * Generated source version: 2.0.1-incubator
 * 
 */

@WebService(targetNamespace = "http://service.test.cxf.idega.com/", name = "HelloSpring")

public interface HelloSpring {

    @ResponseWrapper(targetNamespace = "http://service.test.cxf.idega.com/", className = "com.idega.cxf.test.service.SayHiResponse", localName = "sayHiResponse")
    @RequestWrapper(targetNamespace = "http://service.test.cxf.idega.com/", className = "com.idega.cxf.test.service.SayHi", localName = "sayHi")
    @WebResult(targetNamespace = "", name = "return")
    @WebMethod
    public java.lang.String sayHi(
        @WebParam(targetNamespace = "", name = "arg0")
        java.lang.String arg0
    );
}
