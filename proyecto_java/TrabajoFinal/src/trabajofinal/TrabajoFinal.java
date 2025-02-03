/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.util.Scanner;
import funcion01.funcion01;
import static funcion01.funcion01.funcion01;
import funcion02.funcion02;
import static funcion02.funcion02.funcion02;
import funcion03.funcion03;
import static funcion03.funcion03.funcion03;
import funcion04.funcion04;
import static funcion04.funcion04.funcion04;
import funcion06.funcion06;
import static funcion05.funcion05.funcion05;
import static funcion06.funcion06.funcion06;
import funcion07.funcion07;
import static funcion07.funcion07.funcion07;

/**
 *
 * @author USUARIO
 */
public class TrabajoFinal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contadorActividades = 0;
        int[] contadorActividades1 = new int[7];
        String[] deporte = {"Futbol",
            "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        int[] resultados = new int[7];
        int opcion;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese la diciplina  a la que quiere ingresar: ");
            for (int i = 0; i < deporte.length; i++) {
                System.out.println((i + 1) + "." + deporte[i] + "(" + (i + 1) + ")");
            }
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    funcion01();
                    resultados[0]++;
                    break;
                case 2:
                    funcion02();
                    resultados[1]++;
                    break;
                case 3:
                    funcion03();
                    resultados[2]++;
                    break;
                case 4:
                    funcion05();
                    resultados[3]++;
                    break;
                case 5:
                    funcion04();
                    resultados[4]++;
                    break;
                case 6:
                    funcion06();
                    resultados[5]++;
                    break;
                case 7:
                    funcion07();
                    resultados[6]++;
                    break;
                default:
                    System.out.println("lo sentimos, el club no tiene esa opción.\n");
            }

            System.out.print("¿Desea salor del ciclo? Coloque(s) si desea salir del ciclo ");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                bandera = false;

                System.out.println("Lo sentimos, el club no tiene esta opción");
                bandera = false;
            }

            System.out.println("¿Desea continuar agregando actividades? Ingrese si o no");
            entrada.nextLine();
            String continuar = entrada.nextLine();
            if (continuar.equalsIgnoreCase("no")) {
                bandera = false;
            }
        }
    }
}
