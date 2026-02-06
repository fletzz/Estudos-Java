import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        float temperatura = sc.nextInt();

        float conversor = (temperatura * 9/5) + 32;

        System.out.println(temperatura + "° graus em fahrenheit é: " + conversor + "° graus");
    }
}
