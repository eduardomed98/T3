import java.util.Scanner;

public class CalculadoraSalarioNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBruto, porcentajeImpuestos, deduccionesAdicionales, impuesto, salarioNeto;

        System.out.print("Ingrese el salario bruto mensual: ");
        salarioBruto = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de impuestos (sin el símbolo %): ");
        porcentajeImpuestos = scanner.nextDouble();

        System.out.print("Ingrese las deducciones adicionales: ");
        deduccionesAdicionales = scanner.nextDouble();

        impuesto = salarioBruto * (porcentajeImpuestos / 100);
        salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        System.out.println("El salario neto es: $" + salarioNeto);
    }
}