/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario  {
    private RandomAccessFile archivos;
    private ControladorPersona controladorP;
    private Usuario nuevoUsuario;
    private int tamanioDeArchivo;
    private String eliminar25bytes;
    private String eliminar10bytes;
    private String eliminar50bytes;
    private String eliminar8bytes;
    private String eliminar4bytes;
    private Usuario usuario;
    
    /*
    *private int id|4 bytes
    *private String cedula|10 bytes+ (2bytes)
    *private String nombre|25 bytes+ ((2bytes)
    *Private String apellido|25 bytes+(2bytes)
    *private String direccion|50 bytes +(2bytes)
    *private String fechaDeNacimiento|10 bytes + 2(bytes)
    *private String genero|10 bytes+ (2bytes)
    *private String estadoCivil|8 bytes +(2bytes)
    *private String correo| 25 bytes+ 2 bytes
    *private String contrasenia| 10 bytes +2 bytes
    *tamani total=195
    */

    public ControladorUsuario() {
        try {
            archivos = new RandomAccessFile("datos/Usauarios.dat", "rw");
            tamanioDeArchivo=195;
            eliminar25bytes = "                         ";
            eliminar10bytes = "          ";
            eliminar4bytes = "    ";
            eliminar8bytes = "        ";
            eliminar50bytes = "                                                  ";
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura y lectura [ControladorUsuario]");
            System.out.println(ex);
        }
    }
    
    public void registrar(Usuario usuario){
        try {
            archivos.seek(archivos.length());
            archivos.writeInt(usuario.getId());
            archivos.writeUTF(usuario.getCedula());
            archivos.writeUTF(usuario.getNombre());
            archivos.writeUTF(usuario.getApellido());
            archivos.writeUTF(usuario.getDireccion());
            archivos.writeUTF(usuario.getFechaDeNacimiento());
            archivos.writeUTF(usuario.getGenero());
            archivos.writeUTF(usuario.getEstadoCivil());
            archivos.writeUTF(usuario.getCorreo());
            archivos.writeUTF(usuario.getContrasenia());
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [registrar ControladorUsuario]");
            System.out.println(ex);
        }
    }
    
    public Usuario verUsuario(){
        return nuevoUsuario;
    }
    
    public Usuario login(String correo, String contrasenia){
        /*int salto=156;
        try {
            while(salto<archivos.length()){
              archivos.seek(salto);
              nuevoUsuario=new Usuario();
              nuevoUsuario.setCorreo(archivos.readUTF());
              nuevoUsuario.setContrasenia(archivos.readUTF());
              if(nuevoUsuario.getCorreo().equals(correo)&&nuevoUsuario.getContrasenia().equals(contrasenia)){
                  return nuevoUsuario;
              }
            }
            salto+=tamanioDeArchivo;
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [login ControladorUsuario]");
            System.out.println(ex);
            
        }
        return null;*/
                for (Object object : FindAll()) {
            Method[] metodos = object.getClass().getMethods();
            for(Method m: metodos){
                if (m.getName().equals("getCorreo")){
                    try {
                        if(m.invoke(object, null).equals(correo)){
                            for (Method m1 : metodos) {
                                if(m1.getName().equals("getContrasenia")){
                                    if(m1.invoke(object, null).equals(contrasenia)){
                                        usuario=(Usuario)object;
                                        return (Usuario)object;
                                    }       
                                }
                            }
                        }
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return null;
        
    }
    
    public int generarcodigo(){
        return controladorP.generarCodigo();
    }
    
    public Usuario buscarUsuario(int codigo){
        int salto = 0;
        try {
            while (salto < archivos.length()) {
                archivos.seek(salto);
                usuario=new Usuario();
                usuario.setId(archivos.readInt());
                usuario.setCedula(archivos.readUTF());
                usuario.setNombre(archivos.readUTF());
                usuario.setApellido(archivos.readUTF());
                usuario.setDireccion(archivos.readUTF());
                usuario.setFechaDeNacimiento(archivos.readUTF());
                usuario.setGenero(archivos.readUTF());
                usuario.setEstadoCivil(archivos.readUTF());
                usuario.setCorreo(archivos.readUTF());
                usuario.setContrasenia(archivos.readUTF());
                if(codigo==usuario.getId()){
                    return usuario;
                }
                salto+=tamanioDeArchivo;
                
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [read Controladorusuario]");
            System.out.println(ex);
        }
        return null;
    }
    
    public List<Usuario> FindAll(){
        List <Usuario> usuarios=new ArrayList<>();
        int salto=0;
        try {
            while(salto<archivos.length()){
                archivos.seek(salto);
                usuario=new Usuario();
                usuario.setId(archivos.readInt());
                usuario.setCedula(archivos.readUTF());
                usuario.setNombre(archivos.readUTF());
                usuario.setApellido(archivos.readUTF());
                usuario.setDireccion(archivos.readUTF());
                usuario.setFechaDeNacimiento(archivos.readUTF());
                usuario.setGenero(archivos.readUTF());
                usuario.setEstadoCivil(archivos.readUTF());
                usuario.setCorreo(archivos.readUTF());
                usuario.setContrasenia(archivos.readUTF());
                usuarios.add(usuario);
                salto+=tamanioDeArchivo;
            }
            return usuarios;
        } catch (IOException e) {
            System.out.println("Error escritura y lectura [findAllregistros ControladorRegistros]");
            System.out.println(e);
        }
        return null;
    }
    
}
