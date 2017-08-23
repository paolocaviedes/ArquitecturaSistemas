/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.sb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Paolo-Acer
 */
@Local
public interface TopicosSBLocal {

    List listarDispositivos();
    
}
