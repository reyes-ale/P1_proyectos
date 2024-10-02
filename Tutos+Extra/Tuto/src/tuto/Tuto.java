
package tuto;
import java.util.Scanner;
public class Tuto {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("1. Figura Corbatin");
        System.out.println("2. Figura Bandera");
        
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                int size = 7;
                int rev = size-1;
                for (int i =0;i<size;i++){
                    for(int j = 0;j<size;j++){
                        //System.out.print(i+1);
                        if(j==0||j==size-1||j==i||j+i==size-1){
                            System.out.print(i+1);
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
                
            case 2:
                size = 13;
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if((i==size/2 && j>0 && j<size-1) ||(j==size/2 && i>0 && i<size-1)){
                            System.out.print(" ");
                        }
                        if ((i>0 && i<size-1)&&(j>0&&j<size-1) && !((i==size/2 && j>0 && j<size-1) ||(j==size/2 && i>0 && i<size-1))) {
                            System.out.print("+");
                        }
                        else if(!((i==size/2 && j>0 && j<size-1) ||(j==size/2 && i>0 && i<size-1))){
                            System.out.print("*");
                        }
                        
                    }
                    System.out.println();
                }
                break;
                
        }
    
    }
}
