//Maior de Três: Leia três números e imprima qual é o maior deles.
package exercicios.aula01;

import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " é o maior número");
        } else if (num2 > num3) {
            System.out.println(num2 + " é o maior número");
        } else {
            System.out.println(num3 + " é o maior número");
        }

    }
}
