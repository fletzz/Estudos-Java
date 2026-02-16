//Contagem Regressiva: Imprima de 10 até 0 usando um laço de repetição.
package exercicios.aula02;

import java.util.Scanner;

public class Ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Digite o valor da contagem regressiva: ");
        number = sc.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
