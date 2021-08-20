package tarefa;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao06 {
    public static void main(String[] args) {
        int x;
        Logger logger = Logger.getLogger(Questao06.class.getName());
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        logger.log(Level.INFO, "antecessor: {0}", x - 1);
        logger.log(Level.INFO, "sucessor: {0}", x + 1);
    }
}
