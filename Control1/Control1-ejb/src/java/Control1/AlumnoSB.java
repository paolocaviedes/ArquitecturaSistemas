/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control1;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Paolo-Acer
 */
@Stateless
public class AlumnoSB implements AlumnoSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public List listarAlumnos(){
        List salida = new ArrayList();
               
        for (int i=0; i<10;i++){
            Alumno student= new Alumno();
            student.setNombre("Estudiante"+i);
            student.setRut("18028573-"+i);
            student.setCarrera("Informatica");
            
            ArrayList notas = new ArrayList();
            for (int j=0; j<5;j++){
                Notas nota = new Notas();
                nota.setCodigoasignatura("INS234");
                nota.setNombreasignatura("Disenno");
                nota.setNotafinal("5."+j);
                notas.add(nota);
            }
            student.setNotas(notas);
            
            salida.add(student);
        }
        return salida;
    }
}
