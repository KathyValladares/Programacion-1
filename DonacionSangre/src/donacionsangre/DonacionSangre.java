/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacionsangre;

import java.util.Scanner;

/**
 *
 * @author katyl
 *  Objetivos
 *      1. Estructura de Seleccion Anidadas
 *      2. Operadores Booleanos
 *         a. AND  &&
 *         b. OR   ||
 *         c. NOT  !
 *      3. Operacion Ternaria 
 */
public class DonacionSangre {

    /**
     *  /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        //AND && (Y)
        /*
                Dinero      Tiempo      Resultado
                Si(V)       Si(V)       SI Puede Viajar (V)
                Si(V)       No(F)       No se puede viajar(F)
                No(F)       Si(V)       No se puede viajar (F)
                No(F)       No(F)       No se puede viajar (F)
        */
        
        //OR    || (O)
        /*
            Pasta       Hamburguesas    Resultado
            Si(V)       Si(V)           Se puede comer(V)
            Si(V)       No (F)          Se puede comer (V)
            No(F)       Si(V)           Se puede comer (V)
            No(F)       No(F)           Neles, nose come (F)
        */
        
        //NOT   ! (Negacion)
        
        /*  
                EstadoAnimo     Resultado
                Si(V)           No(F)
                No(F)           Si(V)
        */
      
        
        Scanner input = new Scanner(System.in);
        int edad = 0;
        int peso = 0;
        boolean haDesayunado = true;
        char respuesta = '@';
        int nivelHierro = 0;
        String genero = "John Doe";
        
        System.out.print("Cual es su edad: ");
        edad = input.nextInt();
        System.out.print("Cual es su peso: ");
        peso = input.nextInt();
        
        if(edad>=18 && edad<=65 && peso>=110){
            System.out.println("Tienes los parametros fisicos");
            System.out.print("Has desayunado? Si/No");
            respuesta = input.next().charAt(0);
            
            if(respuesta == 'S' || respuesta =='s'){
                System.out.println("Si puedes donar sangre");
                haDesayunado = true;
            }//Fin del IF COMIDA
            else{
                System.out.println("Tienes que comer antes");
                haDesayunado = false;
            }
        }//Fin del IF EDAD
        else{
            System.out.println("No se puede donar sangre");
        }
        
        System.out.println("");
        System.out.print("Dime tu nivel de hierro: ");
        nivelHierro = input.nextInt();
        input.nextLine();
        System.out.print("Masculino o Femenino: ");
        genero = input.nextLine().toUpperCase();
        
        if((nivelHierro>=14 && genero.equals("MASCULINO"))){
            System.out.println("Si se puede donar sangre");
        }
        else{
            System.out.println("no se puede donar sangre");
        }
    }//Fin de Main
    
}//Fin de Class