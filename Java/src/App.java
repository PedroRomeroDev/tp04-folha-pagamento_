import java.util.Scanner;

public class App {

    public static void header () {
        System.out.println("=========================================");
        System.out.println("==    SISTEMA DE CADASTRO FUNCIONARIO  ==");
        System.out.println("=========================================");
    }

    public static double calcularImposto(double salarioBruto) {
        double inss = 14.0;
        double ir = 27.0;
        double desconto = salarioBruto * ((inss / 100.0) + (ir / 100.0));
        double salarioLiquido = salarioBruto - desconto;
        return salarioLiquido;
    }

    public static double horaextra(double horaextra){
        double valorExtra = 0.00;
        if (horaextra > 0) {
            valorExtra = 5.00 * horaextra;
        }
        return valorExtra;
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double salarioBruto;
        double horasExtras;
        header();

        System.out.print("NOME DO FUNCIONARIO: ");
        String nome = s.next();

        do {
            System.out.print("SALÁRIO BRUTO: ");
            salarioBruto = s.nextDouble();
        } while (salarioBruto < 0.00);

        do {
            System.out.print("HORAS EXTRAS: ");
            horasExtras = s.nextInt();
        } while(horasExtras < 0);

        double salarioLiquido = calcularImposto(salarioBruto);
        salarioLiquido += horaextra(horasExtras);
        System.out.print("Salario Liquido: " + salarioLiquido);
    }
}