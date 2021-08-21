package tarefa;

import java.util.Scanner;
import java.util.logging.Level;         /** importação de classes java.util */
import java.util.logging.Logger;

public class Questao03 {
    public static void main(String[] args) { /** método main */
        Logger logger = Logger.getLogger(Questao03.class.getName()); /** declaração da variável logger para o print de resultados */
        double saldo;               /** declaração de variáveis tipo double para manipulação de valores monetários */
        double saldoReajuste;
        Scanner input = new Scanner(System.in); /** método de leitura dos dados de entrada pelo terminal */
        saldo = input.nextDouble(); /** endereçamento dos dados de entrada para uma variável */
        saldoReajuste = saldo * 1.15; /** operação aritmética conforme a demanda */
        logger.log(Level.INFO, "saldoReajuste: {0}", saldoReajuste); /** print de resultados por meio do logger */
    }
}
