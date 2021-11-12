package tarefa;

import java.util.Scanner;
import java.util.logging.Level;     /** importação da classe java.util */
import java.util.logging.Logger;

public class Questao05 {
    public static void main(String[] args) {    /** método main */
        double salarioMinimo;   /** declaração de variáveis */
        double salarioUsuario;
        Logger logger = Logger.getLogger(Questao05.class.getName()); /** declaração da variável logger para uso do método Logger de impressão de dados */
        Scanner input = new Scanner(System.in); /** declaração da variável input para uso do método Scanner para leitura de dados de entrada no terminal */
        salarioMinimo = input.nextDouble(); /** endereçamento dos dados de entrada para às respectivas variáveis */
        salarioUsuario = input.nextDouble();
        logger.log(Level.INFO,   "Salário(os) mínimo(os): {0}", salarioUsuario/salarioMinimo); /** print dos resultados pelo método logger */
    }
}
