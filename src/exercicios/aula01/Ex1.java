//Par ou Ímpar: Receba um número e diga se ele é par ou ímpar.

package exercicios.aula01;
import java.util.Scanner;

public class Ex1 {
        void main() {
            Scanner sc = new Scanner(System.in);
            int numero;

            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            parOuImpar(numero);

        }

        void parOuImpar (int number) {
            if (number % 2 == 0) {
                System.out.println("O numero " + number + " é par");
            } else {
                System.out.println("O numero " + number + " é ímpar");
            }
        }
    }

