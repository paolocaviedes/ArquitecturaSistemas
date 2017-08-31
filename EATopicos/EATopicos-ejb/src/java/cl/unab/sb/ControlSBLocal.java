/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.sb;

import cl.unab.datos.Alumnos;
import javax.ejb.Local;

/**
 *
 * @author Paolo-Acer
 */
@Local
public interface ControlSBLocal {

    Alumnos listarAlumnos();

    ControlSB listarNotas();
    
}
