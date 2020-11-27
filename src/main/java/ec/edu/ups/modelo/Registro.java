/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Dutan2000
 */
public class Registro {
    private int id;
    private Date fechaDeMatrimonio;
    private int testigo1;
    private int testigo2;
    private String lugarDeCelebracion;
    private int juez;
    private int marido;
    private int mujer;

    public Registro() {
    }

    public Registro(int id, Date fechaDeMatrimonio, String lugarDeCelebracion) {
        this.id = id;
        this.fechaDeMatrimonio = fechaDeMatrimonio;
        this.lugarDeCelebracion = lugarDeCelebracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaDeMatrimonio() {
        return fechaDeMatrimonio;
    }

    public void setFechaDeMatrimonio(Date fechaDeMatrimonio) {
        this.fechaDeMatrimonio = fechaDeMatrimonio;
    }

    public int getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(int testigo1) {
        this.testigo1 = testigo1;
    }

    public int getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(int testigo2) {
        this.testigo2 = testigo2;
    }

    public String getLugarDeCelebracion() {
        return lugarDeCelebracion;
    }

    public void setLugarDeCelebracion(String lugarDeCelebracion) {
        this.lugarDeCelebracion = lugarDeCelebracion;
    }

    public int getJuez() {
        return juez;
    }

    public void setJuez(int juez) {
        this.juez = juez;
    }

    public int getMarido() {
        return marido;
    }

    public void setMarido(int marido) {
        this.marido = marido;
    }

    public int getMujer() {
        return mujer;
    }

    public void setMujer(int mujer) {
        this.mujer = mujer;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registro other = (Registro) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Registro{" + "id=" + id + ", fechaDeMatrimonio=" + fechaDeMatrimonio + ", testigo1=" + testigo1 + ", testigo2=" + testigo2 + ", lugarDeCelebracion=" + lugarDeCelebracion + ", juez=" + juez + ", marido=" + marido + ", mujer=" + mujer + '}';
    }
 
}
