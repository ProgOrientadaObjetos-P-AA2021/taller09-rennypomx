/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    private Persona beneficiario;
    protected int tiempoPrestamoMeses;
    protected String ciudadPrestamo;
    
    public Prestamo (Persona p, int t){
        beneficiario = p;
        tiempoPrestamoMeses = t;
       
    }
    public void establecerBeneficiario(Persona p){  
        beneficiario = p;
    }
    
    public void establecerTiempoPrestamoMeses(int t){  
        tiempoPrestamoMeses = t;
    }
    
    public void establecerCiudad(String c){  
        ciudadPrestamo = c;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public int obtenerTiempoPrestamoMeses(){
        return tiempoPrestamoMeses;
    }
    
    public String obtenerCiudadPrestamo(){
        return ciudadPrestamo;
    }
    @Override
    public String toString(){
        String cadena = String.format("BENEFICIARIO\n\tNombre: %s\n"
                + "\tApellido: %s\nTiempo de prestamo en meses: %d\nCiudad: %s\n",
                beneficiario.obtenerNombre(),beneficiario.obtenerApellido(),
                tiempoPrestamoMeses, ciudadPrestamo); 
        return cadena;
    }
}


