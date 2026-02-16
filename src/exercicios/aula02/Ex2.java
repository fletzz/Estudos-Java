//Tabuada: Peça um número e imprima a tabuada dele de 1 a 10.
package exercicios.aula02;

import java.util.Scanner;

public class Ex2 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int numeroTabuada;
        String operador;

        System.out.println("Digite um numero para a tabuada: ");
        numeroTabuada = sc.nextInt(); //2
        sc.nextLine();

        System.out.println("Digite o operador: ");
        operador = sc.nextLine();

        tabuada(numeroTabuada, operador);
    }

    void tabuada(int numeroT, String operadorS) {
        switch (operadorS) {
            case "*":
                for (int i = 1; i <= 10; i++) { // Está imprimindo números de 1 a 10, para a tabuada
                    int resultado = numeroT * i;
                    System.out.println(numeroT + " * " + i + " = " + resultado);
                }
                break;
            case "+":
                for (int i = 1; i <= 10; i++) {
                    int resultado = numeroT + i;
                    System.out.println(numeroT + " + " + i + " = " + resultado);
                }
                break;
            case "/":
                for (int i = 1; i <= 10; i++) {
                    double resultado = (double) numeroT / i;
                    System.out.println(numeroT + " / " + i + " = " + resultado);
                }
                break;
            case "-":
                for (int i = 1; i <= 10; i++) {
                    int resultado = numeroT - i;
                    System.out.println(numeroT + " - " + i + " = " + resultado);
                }
                break;
        }

    }

}
