package divisao;

import java.util.Scanner;

public class Divisao {

        private static Scanner sc = new Scanner(System.in);
        public static int divide(int dividendo, int divisor) throws ArithmeticException{
            if(divisor == 0) {
                throw new ArithmeticException("Operação matematicamente inválida");
            }
            return dividendo/divisor;
        }

        public static void main (String args[]) {

            System.out.println("Informe o valor do dividendo: ");
            int dividendo = sc.nextInt();
            System.out.println("Informe o valor do divisor: ");
            int divisor = sc.nextInt();
            try {
                System.out.println(divide(dividendo, divisor));
            }
            catch (ArithmeticException e) {
                e.printStackTrace();
            }

        }

    }

