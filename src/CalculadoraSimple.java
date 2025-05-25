import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el primer numero: ");
    double num1 = scanner.nextDouble();

    System.out.println("ingresa el segundo numero: ");
    double num2 = scanner.nextDouble();

    System.out.println("que opreacion deseas realicar: (+, -, *, /)");
    char operacion = scanner.next().charAt(0);
    double resultado = 0;

    switch (operacion){
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
            if(num2 != 0) {
                resultado = num1 / num2;
            } else{
                System.out.println("error, divivsion por 0");
                return;
            }
                break;
        default:
            System.out.println("operacion invalida");
        }

        System.out.println("el resultado de " + num1 + " " + operacion + " " + num2 + " es: " + resultado);
    }
}
