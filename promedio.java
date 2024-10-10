import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, numero3, promedio;

        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        numero3 = scanner.nextDouble();

        promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio de los tres números es: " + promedio);

        scanner.close();
    }
}