import java.util.Scanner;
public class Ejercicio2_Semana03 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int numero;
        // Entrada de datos
        System.out.print("Ingrese un numero entero: ");
        numero = lectura.nextInt();        
        //Aplicamos la condicional doble
        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            //Salida de datos
            System.out.println("El numero es impar.");
            //Fin de programa
        }
    }    
}
