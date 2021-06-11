/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete5.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public final class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private String centroEducativo;
    private double valorCarrera;
    private double valorMensual;
    
    public PrestamoEducativo(Persona p,int t, String e,String c,double v,
            String ci){  
        super(p, t);
        
        nivelEstudio = e;
        centroEducativo = c;
        valorCarrera = v;
        establecerCiudad(ci);
    }
    
    public void establecerNivelEstudio(String e){
        nivelEstudio = e;
    }
     public void establecerCentroEducativo(String c){
        centroEducativo = c;
    }
     public void establecerValorCarrera(double v){
        valorCarrera = v;
    }
    public void calcularValorMensual(){
        valorMensual = ((valorCarrera/tiempoPrestamoMeses)-0.10); 
    }
    
  @Override
    public void establecerCiudad(String c) {
        ciudadPrestamo = c.toUpperCase();
    }
    
    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public String obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }
    @Override
    public String toString() {
        String cadena = String.format("-----------------------------\n"
                + "%s", super.toString());
        cadena = String.format("%s\nNivel de estudio: %s\n"
                + "Centro Educatico: %s\nValor Carrera: %.2f\n"
                + "Valor Mensual Carrera: %.2f\n"
                + "---------------------------------\n", cadena,
                nivelEstudio, centroEducativo, valorCarrera,
                valorMensual);
        return cadena;
    }

}