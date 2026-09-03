import java.util.Scanner;

public class App {

    public static void header () {
        System.out.println("=========================================");
        System.out.println("==    SISTEMA DE CADASTRO FUNCIONARIO  ==");
        System.out.println("=========================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double salarioBruto;
        int horasExtras;
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

    }
}
