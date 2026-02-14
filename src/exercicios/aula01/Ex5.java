/*Triângulos: Leia três lados e diga se podem formar um triângulo e qual o tipo (equilátero, isósceles ou escaleno).

1 = Validar se os 3 lados dos triângulos são iguais:
A < B + C
B < A + C
C < A + B
SE QUALQUER UM FOR FALSO ENT NÃO É TRIÂNGULO

2 = Verificar o tipo de triangulo
-Equilatero:
A = B e B = C
-Isoceles:
A = B ou A = C ou B = C
-Escaleno:
A != B e A != C e B != C

*/

package exercicios.aula01;

import java.util.Scanner;

public class Ex5 {
    void main() {
        Scanner sc = new Scanner(System.in);
        double primeiroL, segundoL, terceiroL;

        System.out.println("Digite o 1° Lado do triângulo: ");
        primeiroL = sc.nextDouble();

        System.out.println("Digite o 2° Lado do triângulo: ");
        segundoL = sc.nextDouble();

        System.out.println("Digite o 3° Lado do triângulo: ");
        terceiroL = sc.nextDouble();

        if (validarLados(primeiroL, segundoL, terceiroL)) {
            String tipo = tipoTriangulo(primeiroL, segundoL, terceiroL);
            System.out.println("O triângulo é do tipo: " + tipo);
        } else {
            System.out.println("Digite valores que formem um triângulo!");
        }

    }

    public boolean validarLados(double a, double b, double c) {
        return (a < b + c && b < a + c && c < a + b);
    }

    String tipoTriangulo(double a, double b, double c) {
        if (a == b && b == c){
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

}
