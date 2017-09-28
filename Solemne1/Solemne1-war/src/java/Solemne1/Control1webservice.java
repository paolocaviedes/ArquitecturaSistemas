/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solemne1;

import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Paolo-Acer
 */
@WebService(serviceName = "Control1webservice")
public class Control1webservice {

    @EJB
    private DeviceSBLocal deviceSB;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getData")
    public String getData(@WebParam(name = "id") String id_dispositivo) {
        //TODO write your implementation code here:
        List entrada = deviceSB.listarDevices();
        Iterator it = entrada.iterator();
        while (it.hasNext()){
            Device dispositivo = (Device) it.next();
            if (dispositivo.getIdDevice().equals(id_dispositivo)){
            
                //Rut Encontrado
                return "ID Dispositivo: "+dispositivo.getIdDevice()+"\nGeorreferencia: "+dispositivo.getLatitude() + ","+dispositivo.getLongitude() + "\nMediciones: \n" +dispositivo.devolverMediciones(); 
            }
        }
            //return student.getNombre() +";"+ txt;
            //out.println(student.getRut());
        
        
        return "Not found!";
    }
}

