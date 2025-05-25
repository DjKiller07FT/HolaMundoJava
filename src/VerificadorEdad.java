import java.util.Scanner;

public class VerificadorEdad {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa tu edad");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        } else if (edad <= 0) {
            System.out.println("edad invalida");
        } else {
            System.out.println("Eres mejor de edad");
        }
    }
}
