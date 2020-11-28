/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Dutan2000
 */
public class Usuario extends Persona{
    private String correo;
    private String contrasenia;

    public Usuario(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Usuario(String correo, String contrasenia, int id, String cedula, String nombre, String apellido, String direccion, String fechaDeNacimiento, String genero, String estadoCivil) {
        super(id, cedula, nombre, apellido, direccion, fechaDeNacimiento, genero, estadoCivil);
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Usuario() {
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.correo);
        hash = 29 * hash + Objects.hashCode(this.contrasenia);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contrasenia, other.contrasenia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", contrasenia=" + contrasenia + '}';
    }
    
    
}
