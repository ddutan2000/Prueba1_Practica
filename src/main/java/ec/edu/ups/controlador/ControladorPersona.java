/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public class ControladorPersona extends ControladorGenerico<Persona> {

    private RandomAccessFile archivos;
    private Persona nuevaPersona;
    private int tamanioDeRegistro;
    private String eliminar25bytes;
    private String eliminar10bytes;
    private String eliminar50bytes;
    private String eliminar8bytes;
    private String eliminar4bytes;

    /*calculo de propiedades
    *private int id|4 bytes
    *private String cedula|10 bytes+ (2bytes)
    *private String nombre|25 bytes+ ((2bytes)
    *Private String apellido|25 bytes+(2bytes)
    *private String direccion|50 bytes +(2bytes)
    *private String fechaDeNacimiento|8 bytes + 2(bytes)
    *private String genero|10 bytes+ (2bytes)
    *private String estadoCivil|8 bytes +(2bytes)
    *total= 140+14=154
     */
    public ControladorPersona() {
        try {
            archivos = new RandomAccessFile("/datos/Persona.dat", "rw");
            tamanioDeRegistro = 154;
            eliminar25bytes = "                         ";
            eliminar10bytes = "          ";
            eliminar4bytes = "    ";
            eliminar8bytes = "        ";
            eliminar50bytes = "                                                  ";

        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura y lectura [ControladorPersona]");
            System.out.println(ex);
        }
    }

    @Override
    public void create(Persona Objeto) {
        try {
            archivos.seek(archivos.length());
            archivos.writeInt(Objeto.getId());
            archivos.writeUTF(Objeto.getCedula());
            archivos.writeUTF(Objeto.getNombre());
            archivos.writeUTF(Objeto.getApellido());
            archivos.writeUTF(Objeto.getDireccion());
            archivos.writeUTF(Objeto.getFechaDeNacimiento());
            archivos.writeUTF(Objeto.getGenero());
            archivos.writeUTF(Objeto.getEstadoCivil());

        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [create ControladorPersona]");
            System.out.println(ex);
        }
    }

    @Override
    public Persona read(int codigo) {
        int salto = 0;
        try {
            while (salto < archivos.length()) {
                archivos.seek(salto);
                nuevaPersona=new Persona();
                nuevaPersona.setId(archivos.readInt());
                nuevaPersona.setCedula(archivos.readUTF());
                nuevaPersona.setNombre(archivos.readUTF());
                nuevaPersona.setApellido(archivos.readUTF());
                nuevaPersona.setDireccion(archivos.readUTF());
                nuevaPersona.setFechaDeNacimiento(archivos.readUTF());
                nuevaPersona.setGenero(archivos.readUTF());
                nuevaPersona.setEstadoCivil(archivos.readUTF());
                if(codigo==nuevaPersona.getId()){
                    return nuevaPersona;
                }
                salto+=tamanioDeRegistro;
                
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [read ControladorPersona]");
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public void update(Persona objeto) {
        int salto=0;
        try {
            while(salto<archivos.length()){
             archivos.seek(salto); 
             nuevaPersona=new Persona();
             nuevaPersona.setId(archivos.readInt());
             if(objeto.getId()==nuevaPersona.getId()){
                 archivos.seek(salto+4);
                 archivos.writeUTF(objeto.getCedula());
                 archivos.writeUTF(objeto.getNombre());
                 archivos.writeUTF(objeto.getApellido());
                 archivos.writeUTF(objeto.getDireccion());
                 archivos.writeUTF(objeto.getFechaDeNacimiento());
                 archivos.writeUTF(objeto.getGenero());
                 archivos.writeUTF(objeto.getEstadoCivil());
             }
             salto+=tamanioDeRegistro;
            }
            
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [update ControladorPersona]");
            System.out.println(ex);
        }
    }

    @Override
    public void delete(Persona Objeto) {
        int salto=0;
        try {
            while(salto<archivos.length()){
              archivos.seek(salto);  
              nuevaPersona=new Persona();
              nuevaPersona.setId(archivos.readInt());
              if(Objeto.getId()==nuevaPersona.getId()){
                  archivos.seek(salto);
                  archivos.writeInt(Integer.parseInt(eliminar4bytes));
                  archivos.writeUTF(eliminar10bytes);
                  archivos.writeUTF(eliminar25bytes);
                  archivos.writeUTF(eliminar25bytes);
                  archivos.writeUTF(eliminar50bytes);
                  archivos.writeUTF(eliminar8bytes);
                  archivos.writeUTF(eliminar10bytes);
                  archivos.writeUTF(eliminar8bytes);
              }
                      
            }
            
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [delete ControladorPersona]");
            System.out.println(ex);
        }
        
    }
    
    
    
    

}
