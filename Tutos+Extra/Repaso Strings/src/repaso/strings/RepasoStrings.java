
package repaso.strings;
import java.util.Scanner;
/**
 *
 * @author alejandra
 */
public class RepasoStrings {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion = 0;
        while (opcion != 3){
            System.out.println();
            System.out.println(" * * * * * MENU * * * * *");
            System.out.println("1. Contraseñas");
            System.out.println("2. Vocales");
            System.out.print("Ingrese una opcion: ");
            opcion=leer.nextInt();
            
            switch (opcion){
                case 1: 
                    String pass;
                    // uno puede leer las cadenas de dos formas:
                    // 1. Scanner.next() <- eso devuelve la cadena ingresada hasta el primer espacio
                    // 2. Scanner.nextline() <- devuelve la linea entera  *forma mas adecuada)
                    //Usuario escribio: Hola mundo
                    // si se usa Scanne.next() = Hola
                    // si se usa Scanne.nextLine() = Hola mundo  
                    
                    System.out.print("Ingrese su contraseña: ");
                    
                    //Como antes de leer esta cadena se ingreso un entero (linea 45:option =leer.nextInt())
                    // es necesario "limpiar" el sanner de la siguiente forma
                    leer.nextLine();
                    pass = leer.nextLine();
                    
                    boolean size = false, upper = false, number = false, symbol = false;
                    
                    if (pass.length() >= 10 && pass.length() < 25){
                        size = true;
                    }
                    else{
                        size = false;
                    }
                    
                    //Recorriendo la cadena
                    for (int i=0; i <pass.length(); i++){
                        //validando que la cadena tenga mayuscula
                        if ((int)pass.charAt(i)>= 65 && (int)pass.charAt(i)<=90){
                            upper = true;
                        }
                        
                        // Validando que la cadena tenga numero
                        if ((int)pass.charAt(i)>=40 && (int)pass.charAt(i)<=57){
                            number = true;
                        }
                        
                        //Validando que la cadena tenga un '!' o un '?'
                        // 33 = ! y 63 = ! en ascii
                        if (pass.charAt(i)=='!' || pass.charAt(i)=='?'){
                            symbol = true;
                        }
                    }
                    
                    if (size && upper && symbol == true){
                        System.out.println("La contraseña es valida");
                    }
                    else {
                        System.out.println("La contraseña no es valida");
                    }
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa");
                    break; 
                    
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
              
            }
        }
    }
        
    }












//un string = lista de caracteres, podemos conocer tamaño y caracter por caracter
// str.length(); -> tamaño de la cadena
// 
        
    
    
/*String cad = "Hola Mundo";
          cad.length();
          boolean tieneU = false;
          cad.contains("u"); // encontrar si cadena tiene u  // charAt(x) = enseña el caracter en laposicion x
          for (int i=0;i<cad.length();i++){
              if ( (int)cad.charAt(i)==117){
                  tieneU = true;
              }
          }
          System.out.println(tieneU);
          //COnseguir el tamano de una cadena 
          System.out.println("El tamano de la cadena cad es: " + cad.length());*/
                  
           //Acceder al n-simo caracter de una cadena 
           //Los indices de las cadenas empiezan en 0
           //si la cadena es de tamaño 10 los indices van de 0 a 9. 
          // System.out.println("El 3er caracter de cad es: " + cad.charAt(3));
           
           //Reemplazar partes de una cadena
           // Reemplazando las a de hola mundo por e
           //String n_cad = cad.replace(0, 0)
                   
          //Cortar una cadena
                   //(/*
