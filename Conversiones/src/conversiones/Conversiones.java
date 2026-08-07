/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;
import java.util.Scanner;


/**
 *
 * @author katyl
 */
public class Conversiones {

     /**
     * @param args the command line arguments
     * Objetivos
     * 1. Orden Secuencial de las Instrucciones
     * 2. Capturar Datos desde Teclado
     * 3. Operaciones Aritmeticas
     * 
     * Desarrollar un algoritmo que me permita convertir los siguientes
     * elementos:
     * 1. Pulgadas a Centimetros
     * 2. Kilometros a Millas
     * 3. Grados Farenheit a grados Celsius
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //Declarar Variables
        int pulgadas = 0;
        double resultadoCM = 0;
        
        double kilometros = 0;
        double millas = 0;
        
        double gradosFar = 0;
        double gradosCel=0;
        
        pulgadas = 10; // Los datos van de der a IZQ -> =
        resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
        
        pulgadas = 35;
        resultadoCM = pulgadas * 2.54;
        System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadoCM,pulgadas);
        
        System.out.println("");
        System.out.println("Cuantos kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros / 1.6;
        
        System.out.printf("%.2f km es igual a %.2f millas \n",kilometros,millas);
        System.out.print(kilometros + " km es igual a "+ millas + " millas ");
        
        System.out.println("");
        
        System.out.print("A como esta la temp Farenheit en la YUSA?");
        gradosFar = teclado.nextDouble();
        
        gradosCel = (gradosFar - 32) * 5/9;
        System.out.printf("Resultado Temp C: %.3f \n",gradosCel);
                
        //Orden de Operaciones si Importa
        //gradosCel = 5 / 9 * gradosFar - 32 ;
        //System.out.printf("Resultado Temp C: %.3f",gradosCel);
    }//Fin de Main
    
}//Fin Class Conversiones