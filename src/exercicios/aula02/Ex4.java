//Fatorial: Calcule o fatorial de um número fornecido pelo usuário.
package exercicios.aula02;

import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number, contador = 1;


        System.out.println("Digite um número: ");
        number = sc.nextInt();


        for (int i = number; i >= 1; i--) {
            contador *= i; // toda vez q o loop vira ele multiplica por si mesmo

        }

        System.out.println(contador);
    }
}
