/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author Renny Poma - Santiago Sarango
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int opcion, meses;
        String nom, apell, tA, mA, ci;
        double valor, v;
        while (bandera) {
            System.out.println("Ingrese 1 si desea un Prestamo de tipo "
                    + "Automovil\nIngrese 2 si desea un Prestamo de tipo "
                    + "Educativo");

            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1 || opcion == 2) {

                System.out.println("\tDATOS DEL BENEFICIARIO");
                System.out.println("--------------------------------------");
                System.out.println("Ingrese el nombre");
                nom = entrada.nextLine();
                System.out.println("Ingrese el apellido");
                apell = entrada.nextLine();

                System.out.println("---------------PRESTAMO---------------");
                System.out.println("Ingrese el tiempo de prestamo en meses");
                meses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad donde hace el prestamo");
                ci = entrada.nextLine();
                Persona p1 = new Persona(nom, apell);
                System.out.println("--------------------------------------");
                if (opcion == 1) {
                    System.out.println("---PRESTAMO AUTOMOVIL---");
                    System.out.println("Ingrese el tipo de automovil");
                    tA = entrada.nextLine();
                    System.out.println("Ingrese la marca del automovil");
                    mA = entrada.nextLine();
                    System.out.println("\tDatos del garante");
                    System.out.println("-------------------------------------");
                    System.out.println("Ingrese el nombre");
                    String nom2 = entrada.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apell2 = entrada.nextLine();
                    Persona p2 = new Persona(nom2, apell2);
                    System.out.println("Ingrese el valor del automovil");
                    valor = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoAutomovil pau = new PrestamoAutomovil(p1, meses,
                            ci, tA, mA, p2, valor);
                    pau.calcularValorMensual();
                    System.out.println(pau);
                } else {
                    System.out.println("---PRESTAMO ESTUDIANTIL---");
                    System.out.println("Ingrese el nivel de estudio");
                    String nivel = entrada.nextLine();
                    System.out.println("Ingrese el nombre del centro educativo");
                    String centro = entrada.nextLine();
                    System.out.println("Ingrese el valor de la carrera");
                    v = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoEducativo pe = new PrestamoEducativo(p1,
                            meses, nivel, centro, v, ci);
                    pe.calcularValorMensual();
                    System.out.println(pe);
                }
            } else {
                System.out.println("La opcion que ingresaste es incorrecta");

            }

            System.out.println("Digite si para ingresar datos\n"
                    + "Digite no para salir del ciclo");
            String ap = entrada.nextLine();
            if (ap.toLowerCase().equals("si")) {
                bandera = true;
            } else if (ap.toLowerCase().equals("no")) {
                bandera = false;
            }

        }

    }

}

