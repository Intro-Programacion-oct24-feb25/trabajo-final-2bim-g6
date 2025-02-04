/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion04;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class funcion04 {

    public static String  funcion04(String cadena) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        double estatura;
        String ciudad;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posición preferida del participante: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la estatura del participante: ");
        estatura = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();

        cadena = String.format("""
                          %sDeporte: Natacion
                          Resumen: 
                          Nombre: %s
                          Edad: %d
                          Posicion: %s
                          Estatura: %s
                          Ciudad:%s 
                          """, cadena, nombre, edad, posicion, estatura,ciudad);
        return cadena;

    }
}


