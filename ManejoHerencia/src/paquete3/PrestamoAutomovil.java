/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public final class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualAutomovil;
    
    public PrestamoAutomovil(Persona p,int t, String c,String ta,String ma, 
            Persona g1, double va){  
        super(p, t);
        
        tipoAutomovil = ta;
        marcaAutomovil = ma;
        garante1 = g1;
        valorAutomovil = va;
        establecerCiudad(c);
    }

    public void establecerTipoAutomovil(String n) {
        tipoAutomovil = n;
    }
    
    public void establecerMarcaAutomovil(String n) {
        marcaAutomovil = n;
    }
    public void establecerGarante1(Persona n) {
        garante1 = n;
        
    }
    public void establecerValorAutomovil(double n) {
        valorAutomovil = n;
    }

    public void calcularValorMensual() {
        valorMensualAutomovil = valorAutomovil / tiempoPrestamoMeses;
    }
    
    @Override
    public void establecerCiudad(String c) {
        ciudadPrestamo = c.toLowerCase();
        
    }
    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }
    
    public Persona obtenerGarante1() {
        return garante1;
    }
    
    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensualAutomovil;
    }
     @Override
    public String toString() {
        String cadena = String.format("---------------------------------\n"
                + "%s", super.toString());
        cadena = String.format("%s\nTipo automovil: %s\nMarcaAutomovil: %s\n"
                + "Garante\n\tNombre: %s\n\tApellido: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual Automovil: %.2f\n"
                + "--------------------------------------\n", cadena,
                tipoAutomovil, marcaAutomovil,
                garante1.obtenerNombre(), garante1.obtenerApellido(),
                valorAutomovil, valorMensualAutomovil);

        return cadena;
    }

}

