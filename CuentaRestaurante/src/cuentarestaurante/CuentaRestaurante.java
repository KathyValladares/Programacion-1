/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;

/**
 *
 * Objetivo
 * 1. Conocer las diferentes tipos de ciclo repeticion
 * 2. Analizar los componentes de todo ciclo de repeticion.
 * 3. Construir un algoritmo con un ciclo de repeticion
 */
public class CuentaRestaurante {

    /**
     * Desarrollar un algoritmo que simule la cuenta de un restaurante
     * que se tiene que pagar entre un grupo de amigos (7 ) dividido
     * en partes iguales.
     */
    /*
        Ciclos de Repeticion
        1. While
        2. Do - While
        3. For
        4. Foreach
    
        Componentes de Ciclos de Repeticion
        1. Variable de Control -> Valor de Inicio
        2. Condicion           -> Limite de Repeticion
            Todo ciclo de repeticion se ejecuta y repite
            siempre y cuando la condicion se mantenga VERDADERA.
        3. Modificador de la Variable Control
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double promedioPago = 0;
        int gastoIndividual = 0;
        
        int numPersona = 1; //Variable de Control
        int gastoAcumulado = 0; //Acumulador
        
        //Condicion ->Variable de Control con Limite
        while(numPersona <= 7){
        //Instrucciones a Repetir
            System.out.printf("Persona %d) Cuanto consumiste? ",numPersona);
            gastoIndividual = sc.nextInt();
            
            gastoAcumulado += gastoIndividual;//Suma de los Gastos
            System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d",
                    numPersona,
                    gastoIndividual,
                    gastoAcumulado);
            System.out.println("");
            //Modificador
            //Opcion #1
            //numPersona += 1; //numPersona = numPersona + 1;
            
            //Opcion #2
            numPersona++;//Incremento Unitario (POST Incremento)
        }//Fin de While

         //promedioPago = gastoAcumulado / 7;//Hardcoding
         numPersona--;//POST Decremento Unitario 
         System.out.printf("\nTotal Personas: %d",numPersona);
         promedioPago = gastoAcumulado / numPersona;
         
         System.out.printf("\nGasto Promedio x Persona: %.2f",promedioPago);
        
        
    }//Fin de Main
    
}//Fin de Class