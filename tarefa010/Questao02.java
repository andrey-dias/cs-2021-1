package tarefa;

import java.util.logging.Level;                 /** importação de classes Java util */
import java.util.logging.Logger;

public class Questao02 {
    public static void main(String[] args) {        /** método main */
        double mediaA = (8 + 9 + 7)/3.0;
        double mediaB = (4 + 5 + 6)/3.0; /** declaração de variáveis e operações aritméticas conforme a demanda */
        double somaAB = mediaB + mediaA;
        double mediaAB = (mediaB + mediaA)/2;
        Logger logger = Logger.getLogger(Questao02.class.getName()); /** declaração da variável logger com o método */
        logger.log(Level.INFO, "mediaA: {0}", mediaA);          /** Logger para o print de resultados */
        logger.log(Level.INFO, "mediaB: {0}", mediaB);   /** print de resultados por meio do método logger */
        logger.log(Level.INFO, "somaAB: {0}", somaAB);
        logger.log(Level.INFO, "mediaAB: {0}", mediaAB);
    }
}
