package tarefa;

import java.util.Scanner;
import java.util.logging.Level; /** importação das classes java.util */
import java.util.logging.Logger;

public class Questao06 {
    public static void main(String[] args) {    /** método main */
        int x; /** declaração da variável int */
        Logger logger = Logger.getLogger(Questao06.class.getName()); /** declaração da variável logger para uso do método de impressão Logger */
        Scanner input = new Scanner(System.in); /** declaração da variável input para uso do método Scanner de leitura de dados de entrada */
        x = input.nextInt(); /** endereçamento dos dados de entrada para a respectiva varíavel */
        logger.log(Level.INFO, "antecessor: {0}", x - 1);
        logger.log(Level.INFO, "sucessor: {0}", x + 1); /** print dos resultados com parâmetros para definir os antecessores e sucessores da variável x */
    }
}
