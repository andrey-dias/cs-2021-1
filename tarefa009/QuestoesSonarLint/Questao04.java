package tarefa;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao04 {
    public static void main(String[] args) {
        int ipi;
        double codigoPeca1;
        double valorPeca1;
        int quantidadePeca1;
        double codigoPeca2;
        double valorPeca2;
        int quantidadePeca2;
        Logger logger = Logger.getLogger(Questao04.class.getName());
        Scanner input = new Scanner(System.in);
        ipi = input.nextInt();
        codigoPeca1 = input.nextInt();
        valorPeca1 = input.nextDouble();
        quantidadePeca1 = input.nextInt();
        codigoPeca2 = input.nextInt();
        valorPeca2 = input.nextDouble();
        quantidadePeca2 = input.nextInt();
        double resultado = (((valorPeca1*quantidadePeca1)+(valorPeca2*quantidadePeca2))*((ipi/100.0)+1));
        logger.log(Level.INFO, "Código da peça 1: {0}", codigoPeca1);
        logger.log(Level.INFO, "Código da peça 2: {0}", codigoPeca2);
        logger.log(Level.INFO, "Resultado: {0}", resultado);
    }
}
