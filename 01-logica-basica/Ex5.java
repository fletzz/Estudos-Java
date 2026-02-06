import java.util.Scanner;

public class Ex5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        float raio = sc.nextFloat();

        double areaDoCirculo = 3.14 * (raio * raio);
        System.out.println("O raio do circulo é de: "+areaDoCirculo);
    }
}
