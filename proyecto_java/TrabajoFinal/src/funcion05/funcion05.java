/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcion05;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class funcion05 {

    public static void funcion05() {
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
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nPosición: %s\nEstatura: %.2f\nCiudad: %s\n",
                nombre, edad, posicion, estatura, ciudad);
    }
}
