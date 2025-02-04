/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion02;

import java.util.Scanner;

public class funcion02 {
    public static String funcion02(String cadena) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String estilo;
        String nivel;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo favorito del participante: ");
        estilo = entrada.nextLine();
        System.out.println("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ");
        nivel = entrada.nextLine();
        cadena = String.format("""
                          %sDeporte: Natacion
                          Resumen: 
                          Nombre: %s
                          Edad: %d
                          Ciudad: %s
                          Estilo: %s
                          Nivel:%s 
                          """, cadena, nombre, edad, ciudad, estilo, nivel);
        return cadena;

    }
}
