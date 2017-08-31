/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Paolo-Acer
 */
@WebService(serviceName = "Alumnos")
public class Alumnos {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "alumno")
    public String notas(@WebParam(name = "rut") String txt) {
        return "Hello " + txt + " !";
    }
}
