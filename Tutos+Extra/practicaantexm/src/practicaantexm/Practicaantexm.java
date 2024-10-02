
package practicaantexm;
import java.util.Scanner;
import java.util.Random;//import java.util.Random;
/**
 *
 * @author aleja
 */
public class Practicaantexm {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random randnum = new Random();
        String acum ="";
        
        int valordado = randnum.nextInt(10)+1;
          System.out.println("Ingrese una cadena: ");
          String cadena = leer.next().toLowerCase();
          for (int i=cadena.length(); i>0; i--){
              char caracter = cadena.charAt(i-1);
              int num=caracter+2;
              acum+=caracter;
              acum+=valordado;
              
              
          }
          
              
                
          System.out.println(acum);
                
            
            
            
        }
    }


/*int tam=leer.nextInt();
        
        
        for (int i=1; i<=tam; i++){
            for (int j=1; j<=tam-i; j++){
                    System.out.print(" ");
               
              }
            
          for (int j=1; j<=(tam*2)-1; j++){
                    System.out.print("*");
               
              }
            
            System.out.println();
            }*/

/* //estrella de david 
        System.out.print("tamaño:  ");
        int tam = leer.nextInt();
        
        while (tam<7 && tam%2==0){
            System.out.println("El numero debe ser impar y mayor a 7");
            System.out.println("Ingrese un numero denuevo: ");
            tam=leer.nextInt();
        }
        for (int i=1; i<=tam; i++){
            for (int j=1; j<=tam; j++){
               if (i==1  || i==tam || j==1 || j==tam ){
                 System.out.print("* ");
             }
               else if (i>=2 && i<=tam-1) || (i>2 && i<=tam-1 && j==tam/2)){
                System.out.print("  ");
                
             
            }
                
             if ((i==2 && j==tam/2) || (i>2 && i<=tam-1 && j==tam/2) )  {
                 
                 System.out.print("|");
             }
            
            }
            System.out.println();      
        }*/

    

    
