/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcion07;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class funcion07 {

    public static String funcion07(String cadena) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String tipoDeYoga;
        String ciudad;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el tipo de yoga que practica el participante: ");
        tipoDeYoga = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();

        cadena = String.format("""
                          %sDeporte: Natacion
                          Resumen: 
                          Nombre: %s
                          Edad: %d
                          Ciudad: %s
                          Estilo: %s
                          Nivel:%s 
                          """, cadena, nombre, edad,tipoDeYoga,ciudad );
        return cadena;

    }
}
