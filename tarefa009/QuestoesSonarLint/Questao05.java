package tarefa;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao05 {
    public static void main(String[] args) {
        double salarioMinimo;
        double salarioUsuario;
        Logger logger = Logger.getLogger(Questao05.class.getName());
        Scanner input = new Scanner(System.in);
        salarioMinimo = input.nextDouble();
        salarioUsuario = input.nextDouble();
        logger.log(Level.INFO,   "Salário(os) mínimo(os): {0}", salarioUsuario/salarioMinimo);
    }
}
