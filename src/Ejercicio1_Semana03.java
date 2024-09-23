import java.util.Scanner;
public class Ejercicio1_Semana03 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //Declaramos la variable
        int numero;        
        // Entrada de datos
        System.out.print("Ingrese un numero entero: ");
        numero = lectura.nextInt();        
        //Aplicamos la condicional simple
        if (numero > 0) {
            //Salida de datos
            System.out.println("El numero es positivo.");
            //Fin de programa
        }
    }    
}
