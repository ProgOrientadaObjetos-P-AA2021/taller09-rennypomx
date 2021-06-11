/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author D E L L
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    
    public Persona (String n, String a){
        nombre = n;
        apellido = a;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String n){
        apellido = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\nApellido: %s\n", 
                nombre, apellido);
        return cadena;
    }

}
