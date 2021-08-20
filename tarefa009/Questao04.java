import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        int ipi;
        int codigoPeca1;
        double valorPeca1;
        int quantidadePeca1;
        int codigoPeca2;
        double valorPeca2;
        int quantidadePeca2;
        Scanner input = new Scanner(System.in);
        ipi = input.nextInt();
        codigoPeca1 = input.nextInt();
        valorPeca1 = input.nextDouble();
        quantidadePeca1 = input.nextInt();
        codigoPeca2 = input.nextInt();
        valorPeca2 = input.nextDouble();
        quantidadePeca2 = input.nextInt();
        System.out.println((((valorPeca1*quantidadePeca1)+(valorPeca2*quantidadePeca2))*((ipi/100.0)+1)));
    }
}
