/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

/**
 *
 * @author katyl
 */
public class Hola_Mundo {

       /**
     * @param args the command line arguments
     */
    
    //Sirve para comentar una sola linea
    /*
        Pleca Asterisco -> Abrir el bloque comentario
        Asterisco Pleca-> Cerrar el bloque comentario
    
        Todo lo de enmedio...es un comentario
    */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            1. Imprimir en pantalla
                a. Salidas formateadas
                b. Caracteres de Escape
            2. Captura de Datos
        */
        
        System.out.println("Hola..me llamo katherine");
        System.out.println("Este sera mi 1er");
        System.out.println("PROGRAMAAA!!!!!!");
        
        System.out.print("Vamos camino a");
        System.out.print("la clase de ");
        System.out.print("Progra!!");
        
        System.out.println("");
        
        System.out.printf("Tu apellido es %S\n","Andrade");
        //System.out.println("");
        //alt + 92 ->\
        
        System.out.printf("%S Tu apellido es\n","Andrade");
        //System.out.println("");
        
        System.out.printf("Tu apellido %S es\n","Andrade");
        
        System.out.println("Hola \n este es \n un nuevo \n amanecer");
        System.out.println("Hola \t este es \t un nuevo \t amanecer");
                
        //Variables
        int edad;       //Tipo Entero
        double peso;    //Tipo Decimal
        char inicial;   //Tipo Caracter ->letras,digitos
                        //,simbolos Especiales
        String nombre;  //Tipo Cadena
        boolean estado; //Tipo Estado ->true(verdadero) 
                        // false(falso)
        
        edad = 21;
        peso = 60.5;
        inicial = 'D';//alt + 39 -> '
        nombre ="Oscar";
        
        System.out.printf("Tengo %d anios \n",edad);
        System.out.printf("Mi peso ideal es %.2f \n",peso);
        System.out.printf("Dime %c por mi inicial",inicial);
        System.out.printf("%s es mi nombre",nombre);
        
    }//Fin de Main
    
}//Fin de Class