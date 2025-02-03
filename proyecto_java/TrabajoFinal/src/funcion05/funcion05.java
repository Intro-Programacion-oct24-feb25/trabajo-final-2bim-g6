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

        System.out.printf("Resumen: Nombre: %s, Edad: %d, Tipo de Ciclismo: %s, Ciudad: %s, Marca: %s\n",
                nombre, edad, tipoDeCiclismo, ciudad, marcaDeBicicleta);
    }
}
