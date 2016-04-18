/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner.y.eso;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class ScannerYEso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException, IOException {
        
        PrintStream salida = new PrintStream( new File("hola_2.txt") );
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Scanner opcion = new Scanner(System.in);
        
        boolean indicador = true;
        while(indicador){
            salida.print(entrada.readLine() + "," );
            System.out.println("Desea Continuar");
            indicador = opcion.nextBoolean();
            
            
        
    }
        
        salida.close();
        
        
        
        
    }
    
}
