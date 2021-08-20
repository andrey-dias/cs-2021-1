package tarefa;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao03 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Questao03.class.getName());
        double saldo;
        double saldoReajuste;
        Scanner input = new Scanner(System.in);
        saldo = input.nextDouble();
        saldoReajuste = saldo * 1.15;
        logger.log(Level.INFO, "saldoReajuste: {0}", saldoReajuste);
    }
}
