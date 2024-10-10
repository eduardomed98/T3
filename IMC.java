import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Ingrese su peso en kilogramos: ");
        peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = scanner.nextDouble();


        imc = peso / (altura * altura);

        System.out.println("Tu índice de masa corporal es: " + imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else
 {
            System.out.println("Obesidad");
        }

        scanner.close();

    }

}
