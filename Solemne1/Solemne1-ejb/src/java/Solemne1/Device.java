/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solemne1;

import java.util.ArrayList;

/**
 *
 * @author Paolo-Acer
 */
public class Device {
    private String idDevice="";
    private int latitude;
    private int longitude;
    private ArrayList<Medicion> Medicion;

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Medicion> getMedicion() {
        return Medicion;
    }

    public void setMedicion(ArrayList<Medicion> Medicion) {
        this.Medicion = Medicion;
    }
    public String devolverMediciones(){
        String mediciones="";
        for (int i=0;i<getMedicion().size();i++){
            mediciones+=getMedicion().get(i).imprimir();
            //notas+=i<getNotas().size()-1?",":"";
            
        }
        return mediciones;
    }
}
