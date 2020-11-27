/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public abstract class ControladorGenerico<T> {
    private RandomAccessFile archivos;
    private int codigo;
    private T tipo;
    private int tamanioDeRegistro;
    private String eliminar25bytes;
    
    /*calculo de propiedades
    *private String cedula|10 bytes+ (2bytes)
    *private String nombre|25 bytes+ ((2bytes)
    *Private String apellido|25 bytes+(2bytes)
    *private String direccion|50 bytes +(2bytes)
    *private Date fechaDeNacimiento|8 bytes + 2(bytes)
    *private String genero|10 bytes+ (2bytes)
    *private String estadoCivil|8 bytes +(2bytes)
    *total= 136+14=150
    
    */

    public ControladorGenerico() {
        try {
            archivos=new RandomAccessFile("/datos/Persona.dat", "rw");
            codigo=0;
            tamanioDeRegistro=150;
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura y lectura [Controlador"+tipo+"]");
            System.out.println(ex);
        }
        
    }
    
    
    
}
