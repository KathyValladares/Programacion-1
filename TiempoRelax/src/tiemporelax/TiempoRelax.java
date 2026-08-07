/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author katyl
 *   Objetivos
 * 1. Seleccion Multiples
 *      a. Estructura
 *      b. Tipos de Condicion
 * 2. Formateo de Cadenas (printf)
 */
public class TiempoRelax {

    /**
     * Desarrollar algoritmo que me permita escoger un pais a visitar.
     * Posterior a ello, debemos nosotros escoger las posibles ciudades
     * a recorrer, sin embargo, solo se puede se puede una ciudad.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = 0;
        char seleccionSubMenu = '@';
        
        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n", "Taniha's Travel","Buen Viaje");
        System.out.println("---------------------------------------");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta: ");
        seleccionMenu = sc.nextInt();
        
        /*
        if/else -> Rango Valores
        switch  -> Igualdad / Todas opciones estan mismo nivel
        */
        
        switch(seleccionMenu){
            case 1:
                System.out.println("Nihon e yōkoso");
                System.out.println("Bienvenido a Japon");
                System.out.println("------------------");
                
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.print("Respuesta: ");
                
                sc.nextLine();//Limpieza de Buffer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                switch(seleccionSubMenu){
                    case 'A':
              
                            System.out.println("Super Nintento World Tour");
                        break;
                        
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                        
                    case 'C':
                        System.out.println("Pabellon Dorado Segun Google");
                        break;
                    default:
                        System.out.println("Cualquier ciudad...");
                        System.out.println("Porque no esta la opcion");
                        System.out.println("que escogiste");
                        break;
                }//Fin de SwitchSubMenu
                break;
            case 2:
                System.out.println("Bienvenue en France");
                System.out.println("Bienvenido a Francia");
                System.out.println("--------------------");
                
                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.print("Respuesta: ");
                
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().charAt(0);
                
                switch(seleccionSubMenu){
                    case '1':
                        System.out.println("Torre Eiffel");
                        break;
                        
                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;
                        
                    case '3':
                        System.out.println("El estadio!!");
                        break;
                    default:
                        System.out.println("Lea ombe..no esta la opcion esa");
                        break;
                }//Fin de Switch SubMenu
                break;
            case 3:
                System.out.println("Nau mai, haere mai! ");
                System.out.println("Bienvenido a Nueva Zelanda ");
                System.out.println("---------------------------");
                
                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford Sound");
                System.out.print("Respuesta: ");
                
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='C'){
                    System.out.printf("%s Mildford Sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
                break;
            case 4:
                System.out.println("Welcome to Canada");
                System.out.println("Bienvenido a Canada");
                break;
        
        }//Fin de Switch MENU

    }//Fin de Main
    
}//Fin de Class