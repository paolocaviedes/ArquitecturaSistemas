/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control1;

/**
 *
 * @author Paolo-Acer
 */
class Notas {
    private String codigoasignatura="";
    private String nombreasignatura="";
    private String notafinal="";

    public String getCodigoasignatura() {
        return codigoasignatura;
    }

    public void setCodigoasignatura(String codigoasignatura) {
        this.codigoasignatura = codigoasignatura;
    }

    public String getNombreasignatura() {
        return nombreasignatura;
    }

    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    public String getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(String notafinal) {
        this.notafinal = notafinal;
    }
    public String imprimir(){
        return "Codigo asignatura: "+codigoasignatura+" \n Nombre asignatura: "+nombreasignatura+" \n Nota final: "+notafinal+"\n\n";
    }
}
