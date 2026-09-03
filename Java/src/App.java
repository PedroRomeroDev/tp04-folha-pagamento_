

public class App {
    public static void main(String[] args) throws Exception {
    

        public static double calcularImposto(double salarioBruto, double horaextra) {
        double inss = 14.0;
        double ir = 27.0;
        double desconto = salarioBruto * ((inss / 100.0) + (ir / 100.0));
        double salarioLiquido = salarioBruto - desconto;
        
        if (horaextra > 0) {
            salarioLiquido += 50.0;
        }
        
        return salarioLiquido;
        }
    }
}
