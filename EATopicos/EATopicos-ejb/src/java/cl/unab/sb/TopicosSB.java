/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.sb;

import cl.unab.datos.Dispositivo;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Paolo-Acer
 */
@Stateless
public class TopicosSB implements TopicosSBLocal {

    @Override
    public List listarDispositivos() {
        List salida=new ArrayList();
        for (int i=0; i<10;i++){
            Dispositivo dis= new Dispositivo();
            dis.setIde(i);
            dis.setNombre("Nombre"+i);
            dis.setIp("192.168.1"+i);
            salida.add(dis);
            
        
        }
        return salida;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
