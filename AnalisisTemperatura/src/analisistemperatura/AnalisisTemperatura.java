/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisistemperatura;

import java.util.Scanner;


/**
 *
 * @author katyl
 */

public class AnalisisTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables de control
        double temperatura; 
        double suma = 0; 
        int contador = 0; 
        double max = Double.NEGATIVE_INFINITY; 
        double min = Double.POSITIVE_INFINITY;

        System.out.println("=== SISTEMA DE ANÁLISIS DE TEMPERATURAS ===");
        System.out.println("Ingrese las lecturas del sensor en °C.");
        System.out.println("Para finalizar el programa, escriba -999.");
        System.out.println("-------------------------------------------");

        // Primer ingreso
        System.out.print("Ingrese temperatura: ");
        temperatura = sc.nextDouble();

        // Ciclo WHILE
        while (temperatura != -999) {
            // Validación contra cero absoluto
            if (temperatura < -273.15) {
                System.out.println("❌ Error: La temperatura ingresada (" + temperatura + " °C) es menor al cero absoluto.");
                System.out.println("Dato descartado. Intente nuevamente.");
            } else {
                // Acumulación de datos válidos
                suma += temperatura;
                contador++;

                // Actualización de máximos y mínimos
                if (temperatura > max) max = temperatura;
                if (temperatura < min) min = temperatura;

                System.out.println("Temperatura registrada: " + temperatura + " °C");
            }

            // Solicitar siguiente dato
            System.out.print("Ingrese temperatura: ");
            temperatura = sc.nextDouble();
        }

        System.out.println("\n=== RESULTADOS DEL ANÁLISIS ===");
        if (contador > 0) {
            double promedio = suma / contador;
            double diferencia = max - min;

            System.out.println("Cantidad de lecturas válidas: " + contador);
            System.out.println("Temperatura promedio: " + promedio + " °C");
            System.out.println("Temperatura máxima: " + max + " °C");
            System.out.println("Temperatura mínima: " + min + " °C");
            System.out.println("Diferencia térmica: " + diferencia + " °C");
        } else {
            System.out.println("No se ingresaron temperaturas válidas para el análisis.");
        }

        System.out.println("Programa finalizado.");
    }
}
