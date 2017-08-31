/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.sb;

import cl.unab.datos.Alumnos;
import cl.unab.datos.Notas;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Paolo-Acer
 */
@Stateless
public class ControlSB {

    public Alumnos listarAlumnos(){
        Alumnos student= new Alumnos();
        student.setNombre("Paolo");
        student.setRut("180285733");
        student.setCarrera("Informatica");
        
        ArrayList notas = new ArrayList();
        for (int i=0; i<5;i++){
            Notas nota = new Notas();
            nota.setCodigoasignatura("NRC234");
            nota.setNombreasignatura("DiseñodeSoftware");
            nota.setNotafinal("6.1");
        }
        return null;
    }
}
  
