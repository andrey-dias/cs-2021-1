package tarefa;

import java.util.Scanner;               /** importação de classes java.util */
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao01 {
    public static void main(String[] args) {
        /**
         * método main
         */
        Integer idadeEmAno;         /** declaração de variáveis */
        Integer idadeEmMes;
        Integer idadeEmDias;
        Logger logger = Logger.getLogger(Questao01.class.getName());   /** declaração da classe Logger por recomendação */
        Integer totalDias;                                             /**  do SonarLint                                */
        Scanner input = new Scanner(System.in);
        String[] entrada = input.nextLine().split(" ");
        idadeEmAno = Integer.parseInt(entrada[0]);                  /** declaração da String de entrada e Scanner para leitura de dados */
        idadeEmMes = Integer.parseInt(entrada[1]);                  /** conversão de String para tipo int */
        idadeEmDias = Integer.parseInt(entrada[2]);
        totalDias = (idadeEmAno*365) + (idadeEmMes*30) + idadeEmDias;
        logger.log(Level.INFO,"totalDias: {0}", totalDias);    /** print de dados por meio do Logger */
    }
}