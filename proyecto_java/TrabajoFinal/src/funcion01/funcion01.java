/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion01;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class funcion01 {

    public static String funcion01(String cadena) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        String ciudad;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posición preferida del participante: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();

  cadena  = String.format("""
                          %sDeporte: Futbol
                          Resumen: 
                          Nombre: %s
                          Edad: %d
                          Posici\u00f3n: %s
                          Ciudad: %s
                          """,cadena, nombre, edad, posicion, ciudad);
        return cadena ;
    }
}
