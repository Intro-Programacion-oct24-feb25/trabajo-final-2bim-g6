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
    public static void funcion04() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String tipoDeCiclismo;
        String ciudad;
        String marcaDeBicicleta;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.println("Ingrese el tipo de ciclismo del participante (Montaña, Ruta, Urbano): ");
        tipoDeCiclismo = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca de bicicleta preferida del participante: ");
        marcaDeBicicleta = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nTipo: %s\nCiudad: %s\nMarca: %s\n",
                nombre, edad, tipoDeCiclismo, ciudad, marcaDeBicicleta);
    }


    
    
}


    