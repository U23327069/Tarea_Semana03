import java.util.Scanner;
public class Ejercicio3_Semana03 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int dia;
        //Aplicamos lo valores iniciales
        System.out.print("Ingrese un numero del 1 al 7 para saber el dia de la semana: ");
        dia = lectura.nextInt();        
        //Aplicaremos la condicional múltiple switch
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero no valido. Ingrese un numero entre 1 al 7.");
        }
    }    
}
