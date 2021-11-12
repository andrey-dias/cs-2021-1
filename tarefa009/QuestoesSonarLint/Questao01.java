package tarefa;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao01 {
    public static void main(String[] args) {
        Integer idadeEmAno;
        Integer idadeEmMes;
        Integer idadeEmDias;
        Logger logger = Logger.getLogger(Questao01.class.getName());
        Integer totalDias;
        Scanner input = new Scanner(System.in);
        String[] entrada = input.nextLine().split(" ");
        idadeEmAno = Integer.parseInt(entrada[0]);
        idadeEmMes = Integer.parseInt(entrada[1]);
        idadeEmDias = Integer.parseInt(entrada[2]);
        totalDias = (idadeEmAno*365) + (idadeEmMes*30) + idadeEmDias;
        logger.log(Level.INFO,"totalDias: {0}", totalDias);
    }
}