import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        double saldo;
        double saldoReajuste;
        Scanner input = new Scanner(System.in);
        saldo = input.nextDouble();
        saldoReajuste = saldo * 1.15;
        System.out.println(saldoReajuste);
    }
}
