//Calculadora Básica: Peça dois números e um operador (+, -, *, /) e realize a operação usando switch.
package exercicios.aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        double num1, num2, resultado;
        String operador = "";

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o operador ");
        operador = sc.nextLine();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + df.format(resultado));
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + df.format(resultado));
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + df.format(resultado));
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + df.format(resultado));
                break;
        }

    }
}
