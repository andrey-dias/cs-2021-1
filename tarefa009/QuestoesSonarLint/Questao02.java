package tarefa;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao02 {
    public static void main(String[] args) {
        double mediaA = (8 + 9 + 7)/3.0;
        double mediaB = (4 + 5 + 6)/3.0;
        double somaAB = mediaB + mediaA;
        double mediaAB = (mediaB + mediaA)/2;
        Logger logger = Logger.getLogger(Questao02.class.getName());
        logger.log(Level.INFO, "mediaA: {0}", mediaA);
        logger.log(Level.INFO, "mediaB: {0}", mediaB);
        logger.log(Level.INFO, "somaAB: {0}", somaAB);
        logger.log(Level.INFO, "mediaAB: {0}", mediaAB);
    }
}
