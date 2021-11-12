import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Integer idadeEmAno;
        Integer idadeEmMes;
        Integer idadeEmDias;
        int totalDias;
        Scanner input = new Scanner(System.in);
        String[] entrada = new String[3];
        entrada = input.nextLine().split(" ");
        idadeEmAno = Integer.parseInt(entrada[0]);
        idadeEmMes = Integer.parseInt(entrada[1]);
        idadeEmDias = Integer.parseInt(entrada[2]);
        totalDias = (idadeEmAno*365) + (idadeEmMes*30) + idadeEmDias;
        System.out.println(totalDias);
    }
}