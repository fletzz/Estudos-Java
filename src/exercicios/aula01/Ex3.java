//Aprovação Escolar: Com base na média, diga se o aluno está "Aprovado" (>= 7), "Recuperação" (5 a 6.9) ou "Reprovado" (< 5).
package exercicios.aula01;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double primeiroBi, segundoBi, terceiroBi, quartoBi, media;

        System.out.println("Digite a nota do primeiro bimestre: ");
        primeiroBi = sc.nextDouble();
        System.out.println("Digite a nota do segundo bimestre: ");
        segundoBi = sc.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        terceiroBi = sc.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        quartoBi = sc.nextDouble();

        media = (primeiroBi + segundoBi + terceiroBi + quartoBi) / 4;

        if (media >= 7){
            System.out.printf("Aprovado com média: %.2f%n " , media);
        } else if (media < 6.9 && media >= 5) {
            System.out.printf("Recuperação com média: %.2f%n" , media);
        } else {
            System.out.printf("Reprovado com média: %.2f%n" , media);
        }

    }
}
