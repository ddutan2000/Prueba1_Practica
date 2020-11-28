/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Registro;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public class ControladorRegistro extends ControladorGenerico<Registro> {

    private Registro registro;
    private RandomAccessFile archivos;
    private Persona testigo1;
    private Persona testigo2;
    private Persona juez;
    private Persona mujer;
    private Persona marido;
    private int tamanioDeArchivos;
    private int eliminar4bytes;
    private String eliminar10bytes;
    private String eliminar25bytes;
    private ControladorPersona controladorPersona;
    private int codigo;

    /*tamaño de archivo
    *private int id| 4 bytes
    *private String fechaDeMatrimonio| 10 bytes +2 bytes
    *private int testigo1| 4 bytes
    *private int testigo2| 4 bytes
    *private String lugarDeCelebracion| 25 bytes+ 2 bytes
    *private int juez| 4 bytes
    *private int marido| 4 bytes
    *private int mujer|4 bytes
    *total=63 bytes
     */
    public ControladorRegistro() {
        try {
            archivos = new RandomAccessFile("datos/Registro.dat", "rw");
            tamanioDeArchivos = 63;
            eliminar4bytes =0;
            eliminar10bytes = "          ";
            eliminar25bytes = "                         ";
            codigo=0;

        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura y lectura [ControladorRegistro]");
            System.out.println(ex);
        }
    }

    @Override
    public void create(Registro Objeto) {
        int salto = 0;
        try {
            while (salto < archivos.length()) {
                archivos.seek(salto);
                testigo1 = controladorPersona.read(Objeto.getTestigo1());
                testigo2 = controladorPersona.read(Objeto.getTestigo2());
                juez = controladorPersona.read(Objeto.getJuez());
                mujer = controladorPersona.read(Objeto.getMujer());
                marido = controladorPersona.read(Objeto.getMarido());
                
                archivos.writeInt(Objeto.getId());
                archivos.writeUTF(Objeto.getFechaDeMatrimonio());
                archivos.writeInt(testigo1.getId());
                archivos.writeInt(testigo2.getId());
                archivos.writeUTF(Objeto.getLugarDeCelebracion());
                archivos.writeInt(juez.getId());
                archivos.writeInt(marido.getId());
                archivos.writeInt(mujer.getId());
                
                mujer.setEstadoCivil("Casado  ");
                controladorPersona.update(mujer);
                marido.setEstadoCivil("Casado  ");
                controladorPersona.update(marido);
            }

        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [create ControladorRegistro]");
            System.out.println(ex);
        }
    }

    @Override
    public Registro read(int codigo) {
        int salto = 0;
        try {
            while (salto < archivos.length()) {
                archivos.seek(salto);
                registro=new Registro();
                registro.setId(archivos.readInt());
                registro.setFechaDeMatrimonio(archivos.readUTF());
                registro.setTestigo1(archivos.readInt());
                registro.setTestigo2(archivos.readInt());
                registro.setLugarDeCelebracion(archivos.readUTF());
                registro.setJuez(archivos.readInt());
                registro.setMarido(archivos.readInt());
                registro.setMujer(archivos.readInt());
                if(registro.getId()==codigo){
                    return registro;
                }
            }
            salto+=tamanioDeArchivos;

        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [read ControladorRegistro]");
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public void delete(Registro Objeto) {
        int salto = 0;
        try {
            while(salto<archivos.length()){
              archivos.seek(salto); 
              //testigo1 = controladorPersona.read(Objeto.getTestigo1());
              //testigo2 = controladorPersona.read(Objeto.getTestigo2());
              //juez = controladorPersona.read(Objeto.getJuez());
              mujer = controladorPersona.read(Objeto.getMujer());
              marido = controladorPersona.read(Objeto.getMarido());
              registro.setId(archivos.readInt());
              if(registro.getId()==Objeto.getId()){
                  archivos.writeInt(eliminar4bytes);
                  archivos.writeUTF(eliminar10bytes);
                  archivos.writeInt(eliminar4bytes);
                  archivos.writeInt(eliminar4bytes);
                  archivos.writeUTF(eliminar25bytes);
                  archivos.writeInt(eliminar4bytes);
                  archivos.writeInt(eliminar4bytes);
                  archivos.writeInt(eliminar4bytes);
                  
                  mujer.setEstadoCivil("Soltero ");
                  marido.setEstadoCivil("Soltero ");
                  controladorPersona.update(mujer);
                  controladorPersona.update(marido);
              }
            }
            salto+=tamanioDeArchivos;
            
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [delete ControladorRegistro]");
            System.out.println(ex);
        }
    }
    
    public int generacodigo(){
        try{
        codigo=0;
            int tamanototal=(int)archivos.length();
            if(archivos.length()>0){
                    tamanototal-=tamanioDeArchivos;
                    archivos.seek(tamanototal);
                    codigo+=archivos.readInt();                
            }
        } catch (IOException e) {
            System.out.println("Error escritura y lectura [CodigoActual controladorPersona]");
            System.out.println(e);
        }
        return codigo+1;
    }
    
    public List<Registro> findAllRegistros() {
        List <Registro> facturasA=new ArrayList<>();
        int salto=0;
        try {
            while(salto<archivos.length()){
                archivos.seek(salto);
                registro=new Registro();
                registro.setId(archivos.readInt());
                registro.setFechaDeMatrimonio(archivos.readUTF());
                registro.setTestigo1(archivos.readInt());
                registro.setTestigo2(archivos.readInt());
                registro.setLugarDeCelebracion(archivos.readUTF());
                registro.setJuez(archivos.readInt());
                registro.setMarido(archivos.readInt());
                registro.setMujer(archivos.readInt());
                facturasA.add(registro);
                salto+=tamanioDeArchivos;
            }
            return facturasA;
        } catch (IOException e) {
            System.out.println("Error escritura y lectura [findAllregistros ControladorRegistros]");
            System.out.println(e);
        }
        return null;
    }


}
