
package ejemplo;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejemplo {
    static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
                
        String cad1="Hola";
        String cad2="mundo";
        System.out.printf("%s%n%s",cad1 ,cad2);
        System.out.println("");
         revnum();
         
         
              
                  
           
    }
    public static void revnum(){
        System.out.print("Ingrese un numero: ");
        int num=leer.nextInt();
        while (num<=0 || num>=10){
            System.out.println("El numero debe no puede ser ni 0 ni negativo ni mayor o igual a 10");
            System.out.print("Ingrese el numero denuevo: ");
            num=leer.nextInt();
            
        }
        int fact=1;
        for (int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("El factorial de " + num + " es " + fact);
    }
        
    }

//un string = lista de caracteres, podemos conocer tamaño y caracter por caracter
// str.length(); -> tamaño de la cadena
// 

/*Scanner leer = new Scanner (System.in);
          String cad = "Hola Mundo";
          cad.length();
          boolean tieneU = false;
          cad.contains("u"); // encontrar si cadena tiene u  // charAt(x) = enseña el caracter en laposicion x
          for (int i=0;i<cad.length();i++){
              if ( (int)cad.charAt(i)==117){
                  tieneU = true;
              }
          }
          System.out.println(tieneU);*/

/*Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese filas: ");
        int filas =leer.nextInt();
        System.out.println("Ingrese columnas: ");
        int col=leer.nextInt();
        
        for (int i=1;i<=filas;i++){
            for (int j=1; j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
/*Scanner leer=new Scanner (System.in);
              int contpar=0, contimp=0;
              char resp='s';
              while (resp=='s'||resp=='S'){
                  System.out.print("Ingrese un numero: ");
                  int num=leer.nextInt();
                  if (num%2==0){
                      num=1;
                      contpar++;
                      
                  }
                  else{
                      num=2;
                      contimp++;
                      
                              
                  }
                  switch (num){
                      case 1:
                          System.out.println("El numero es par");
                         break;
                      case 2:
                          System.out.println("El numero es impar");
                          break;
                    
                         
                  }
                  System.out.println("Desea ingresar mas numeros [s/n]: ");
                  resp=leer.next().charAt(0);
                  
                  
              }
              System.out.println("Pares: "+ contpar);
              System.out.println("Impares: " + );*/

/*System.out.print("Ingrese su nombre completo: ");
              String nombre=leer.nextLine();
              System.out.println("Mucho gusto " + nombre + " su cuenta esta activa");
              
              String prueba= "mariposa";
              System.out.println(prueba.length());*/

    