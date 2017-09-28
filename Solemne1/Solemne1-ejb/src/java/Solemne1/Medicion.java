/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solemne1;

/**
 *
 * @author Paolo-Acer
 */
public class Medicion {
    private int airVelocity;
    private int airDirection;
    private int airTemperature;
    private int waterTemperature;

    public int getAirVelocity() {
        return airVelocity;
    }

    public void setAirVelocity(int airVelocity) {
        this.airVelocity = airVelocity;
    }

    public int getAirDirection() {
        return airDirection;
    }

    public void setAirDirection(int airDirection) {
        this.airDirection = airDirection;
    }

    public int getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
    public String imprimir(){
        return "Velocidad del viento: "+airVelocity+" \n Direccion del viento: "+airDirection+" \n Temperatura ambiente: "+airTemperature+"\n Temperatura del agua: "+waterTemperature+"\n\n";
    }
}
