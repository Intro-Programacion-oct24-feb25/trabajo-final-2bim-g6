/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.util.Scanner;
import static funcion01.funcion01.funcion01;
import static funcion02.funcion02.funcion02;
import static funcion03.funcion03.funcion03;
import static funcion04.funcion04.funcion04;
import static funcion05.funcion05.funcion05;
import static funcion06.funcion06.funcion06;
import static funcion07.funcion07.funcion07;

public class trabajoFinal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] areas = {"Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        int[] resultados = new int[7];
        int totalActividades = 0;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese la disciplina a la que quiere ingresar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + "." + areas[i]);
            }
            int opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
                case 1:
                    funcion01();
                    resultados[0]++;
                    totalActividades++;
                    break;
                case 2:
                    funcion02();
                    resultados[1]++;
                    totalActividades++;
                    break;
                case 3:
                    funcion03();
                    resultados[2]++;
                    totalActividades++;
                    break;
                case 4:
                    funcion04();
                    resultados[3]++;
                    totalActividades++;
                    break;
                case 5:
                    funcion05();
                    resultados[4]++;
                    totalActividades++;
                    break;
                case 6:
                    funcion06();
                    resultados[5]++;
                    totalActividades++;
                    break;
                case 7:
                    funcion07();
                    resultados[6]++;
                    totalActividades++;
                    break;
                default:
                    System.out.println("Lo sentimos, el club no tiene esta opción.");
                    bandera = false;
            }

            System.out.println("¿Desea continuar agregando actividades? Ingrese 'si' o 'no'");
            String continuar = entrada.nextLine();
            if (continuar.equalsIgnoreCase("no")) {
                bandera = false;
            }
        }

        obtenerInformacion(totalActividades);
        obtenerReporte(areas, resultados);
    }

   
    public static void obtenerInformacion(int total) {
        if (total == 0) {
            System.out.println("Mala campaña, debemos mejorar");
        } else if (total <= 5) {
            System.out.println("Poca participación en el club, hay que mejorar");
        } else if (total <= 15) {
            System.out.println("Buena participación, sigan así.");
        } else {
            System.out.println("Excelente campaña del club.");
        }
    }

    public static void obtenerReporte(String[] areas, int[] resultados) {
        System.out.println("Las actividades ingresadas son:");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%d. Número de Participantes de %s: %d\n", (i + 1), areas[i], resultados[i]);
        }
    }
}
