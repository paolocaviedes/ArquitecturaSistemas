/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solemne1;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Paolo-Acer
 */
@Stateless
public class DeviceSB implements DeviceSBLocal {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public List listarDevices() {
        List salida = new ArrayList();
               
        for (int i=0; i<10;i++){
            Device dispositivo= new Device();
            dispositivo.setIdDevice("id00"+i);
            dispositivo.setLatitude(i);
            dispositivo.setLongitude(i);
            
            ArrayList mediciones = new ArrayList();
            for (int j=0; j<5;j++){
                Medicion medicion = new Medicion();
                medicion.setAirDirection(j);
                medicion.setAirTemperature(j);
                medicion.setAirVelocity(j);
                medicion.setWaterTemperature(j);

                mediciones.add(medicion);
            }
            dispositivo.setMedicion(mediciones);
            
            salida.add(dispositivo);
        }
        return salida;
    }

}
