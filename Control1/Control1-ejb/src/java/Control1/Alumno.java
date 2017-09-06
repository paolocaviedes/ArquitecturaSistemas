/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control1;

import java.util.ArrayList;

/**
 *
 * @author Paolo-Acer
 */
public class Alumno {
    private String rut="";
    private String nombre="";
    private String carrera="";
    private ArrayList<Notas> Notas;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public ArrayList<Notas> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Notas> Notas) {
        this.Notas = Notas;
    }
    
    public String devolverNotas(){
        String notas="";
        for (int i=0;i<getNotas().size();i++){
            notas+=getNotas().get(i).imprimir();
            //notas+=i<getNotas().size()-1?",":"";
            
        }
        return notas;
    }
    
}
