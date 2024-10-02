
package tutomemo;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Tutomemo {

    public static void main(String[] args) {
        
        int n = 9;
        int m = (n*2)-3;
        int n2 = n+2;
        int cont = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                
                if(i ==0 && j==n-2){
                    System.out.print("*");
                }else if((i>0 && i!= n-1) && (j==(n-2)-i || j==(n-2)+i)){
                    System.out.print("*");
                }else if(i==n-2){
                    System.out.print("*"); 
                }else if(i==1){
                    System.out.print("+");
                }else if(i== n-1 && j==n-2){
                    System.out.print("+");
                }else if( j+i == m ||j+1==i){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
                
            }
            cont ++;
            System.out.println("");
        }
    }
}
        
    
    

