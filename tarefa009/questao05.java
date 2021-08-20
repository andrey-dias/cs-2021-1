import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        double salarioMinimo;
        double salarioUsuario;
        Scanner input = new Scanner(System.in);
        salarioMinimo = input.nextDouble();
        salarioUsuario = input.nextDouble();
        System.out.println(salarioUsuario/salarioMinimo + " Salário(os) mínimo(os)");
    }
}
