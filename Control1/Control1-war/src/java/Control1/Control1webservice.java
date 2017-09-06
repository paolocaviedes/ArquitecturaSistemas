/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control1;

import static java.lang.System.out;
import java.util.ArrayList;
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
    private AlumnoSBLocal alumnoSB;

    /**
     * This is a sample web service operation
     * @param txt
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        
        List entrada = alumnoSB.listarAlumnos();
        Iterator it = entrada.iterator();
        while (it.hasNext()){
            Alumno student = (Alumno) it.next();
            if (student.getNombre().equals(txt)){
                
                return student.getRut() + ";" +student.getNotas();
            }
            //return student.getNombre() +";"+ txt;
            //out.println(student.getRut());
        }
        
        return "Not found!";
}
    
    
    @WebMethod(operationName = "findStudent")
    public String findStudent(@WebParam( name = "rut") String cv) {
        
        List entrada = alumnoSB.listarAlumnos();
        Iterator it = entrada.iterator();
        while (it.hasNext()){
            Alumno student = (Alumno) it.next();
            if (student.getRut().equals(cv)){
                
                //Rut Encontrado
                return "Nombre Alumno: "+student.getNombre()+"\nRut Alumno: "+student.getRut() + "\nNotas\n" +student.devolverNotas(); 
                }
            }
            //return student.getNombre() +";"+ txt;
            //out.println(student.getRut());
        
        
        return "Not found!";
    }
}
    
