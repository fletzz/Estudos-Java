import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();

        float media = (number1+number2+number3)/3;

        System.out.println(media);

    }
}
