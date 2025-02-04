/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcion06;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class funcion06 {

    public static String  funcion06(String cadena) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String manoHabil;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la mano habil del participante: ");
        manoHabil = entrada.nextLine();

       cadena = String.format("""
                          %sDeporte: Natacion
                          Resumen: 
                          Nombre: %s
                          Edad: %d
                          Ciudad: %s
                          Estilo: %s
                          Nivel:%s 
                          """, cadena, nombre, edad, nivel, ciudad, manoHabil );
        return cadena;

    }
}