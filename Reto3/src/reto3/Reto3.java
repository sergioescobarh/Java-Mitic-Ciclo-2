
package reto3;

import java.util.Arrays;
import java.util.Scanner;

public class Reto3 {

  
    public static void main(String[] args) {
        //Lectura del n y de los n elementos del vector
        Scanner leer = new Scanner(System.in);
        int n =Integer.parseInt(leer.nextLine()); //Lectura de n y conversion de string a int
        
        //Lenado de vector de n elementos
        int [] vector = new int [n];
        for (int i=0;i<n;i++){
        Scanner lectura = new Scanner(System.in);
        vector [i] = Integer.parseInt(lectura.nextLine());
        }
        
        //operaciones necesarios para las respuestas y los outputs
        int sumatoria = 0;//variable inicializada
        for (int j:vector){
        sumatoria = sumatoria + vector[j];
        }
        int promedio = sumatoria/n;
        
        //Ordenar vector de menor a mayor:
        
        Arrays.sort(vector);
        
        //Mínimo:
        
        int min = vector[0];
        //Máximo:
        
        int max = vector[n-1];
    }
    
}
