/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public abstract class ControladorGenerico<T> {
    //private RandomAccessFile archivos;
    private int codigo;
    private T tipo;

    public ControladorGenerico() {
        codigo=0;
    }
    
    public void create(T Objeto){
        
    }
    
    public T read(int codigo){
        return null;
    }
    
    public void delete(T Objeto){
        
    }
    
    public void update(T objeto){
        
    }
    
    public int generarCodigo(){
        int siguientecodigo=++codigo;
        return siguientecodigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
