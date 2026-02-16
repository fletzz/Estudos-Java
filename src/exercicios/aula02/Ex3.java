//Soma de Intervalo: Peça dois números e some todos os números inteiros entre eles.
package exercicios.aula02;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numeroInicial, numeroFinal, contador = 0;

        System.out.println("Digite o primeiro número: ");
        numeroInicial = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        numeroFinal = sc.nextInt();

        for (int i = numeroInicial; i <= numeroFinal; i++) {
            contador += i;
        }

        System.out.println("A soma de intervalo entre " + numeroInicial + " e " + numeroFinal + " é igual a: " + contador);
    }
}
