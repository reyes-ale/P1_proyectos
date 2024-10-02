
package practicaexm2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Practicaexm2 {
Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese filas: ");
        int fil = leer.nextInt();
        System.out.println("Ingrese col: ");
        int col = leer.nextInt();
        
        int [][] matriz = new int [fil][col];
       
        String resp = JOptionPane.showInputDialog(null, "Ingrese su edad: \n");
        int edad = Integer.parseInt(resp);
        System.out.println(edad);
        
        Object [] opciones = {"huevos","salsa","jugos","tomates"};
        int respuesta  = JOptionPane.showOptionDialog(null, "Seleccione una comida", "comida",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        switch (respuesta){
            case 0:
                ////JOptionPane.showMessageDialog(parenulntComponent, edad);
                
        }
        ArrayList <Integer> lista = new ArrayList<>();
        lista.add(23);
        lista.add(123);
        lista.add(20);
        lista.add(77);
        lista.add(87);
       
        Collections.sort(lista);
        System.out.println(lista);
    }
    
    public int[][] llenar (int filas, int columnas){
        int matriz [][]= new int [filas][columnas];
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
            matriz [i][j] = rand.nextInt(10)+1;
        }
      
        
    }
    
      return matriz;
    
}
}
