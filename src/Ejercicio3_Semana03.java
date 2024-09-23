import java.util.Scanner;
public class Ejercicio3_Semana03 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int dia;
        // Entrada de datos
        System.out.print("Ingrese un número (1-7) para saber el día de la semana: ");
        dia = lectura.nextInt();        
        // Condicional múltiple con switch
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Ingrese un número entre 1 y 7.");
        }
    }    
}
