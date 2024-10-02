/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistejemplo;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEjemplo {

    public static void main(String[] args) {
        Scanner kore = new Scanner(System.in);
        
        ArrayList <String> libreria = new ArrayList<>();
        libreria.add("Harry Potter");
        
        System.out.println("MENU");
        int opcion = 0;
        while(opcion !=5){
            System.out.println("1. Arreglar\n2. Listar\n3. Eliminar\n4. Actualizar\n5. Salir\nIngrese su opción:");
            opcion= kore.nextInt();
            System.out.println("");
            switch(opcion){
                
                case 1:
                    System.out.println("Ingrese nombre del libro a agregar:");
                    kore.nextLine();
                    String libro = kore.nextLine();
                    libreria.add(libro);
                    System.out.println("Se agrego el libro: " + libro + " a la libreria");
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.println("Libros: ");
                    for(int i =0 ; i<libreria.size(); i++){
                        System.out.println(i+1 + ". " + libreria.get(i));
                    }
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println("Libros: ");
                    for(int i = 0 ;i<libreria.size();i++){
                        System.out.println(i+1 + ". " + libreria.get(i));                        
                    }
                    System.out.println("Ingrese el indice del libro que quiera eliminar: ");
                    int indice = kore.nextInt();
                    
                    libreria.remove(indice-1);
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("Libros: ");
                    for(int i =0; i<libreria.size(); i++){
                        System.out.println(i+1 + ". " + libreria.get(i));                        
                    }
                    System.out.println("Ingrese el indice del libro que quiera actualizar: ");
                    int indice2 = kore.nextInt();
                    
                    System.out.println("Ingrese el texto que desea ingresar en esa posición: ");
                    kore.nextInt();
                    String libro2 = kore.nextLine();
                    libreria.set(indice2, libro2);
                    break;
                    
                    
            }
        }      
              
        
    }
    
}
