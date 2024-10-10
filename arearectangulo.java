import java.util.Scanner;

public class arearectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Ingrese la base del rectángulo: ");
        base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }

}