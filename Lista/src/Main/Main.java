package Main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner leitor = new Scanner(System.in);
        int i,

        for(int i= 0; i <10; i++){
            System.out.println("Digite um valor:");
            int num = leitor.nextInt();
            valor[i] =num;
        }
        Arrays.sort(valor);
        int maior =valor[9];
        int menor =valor[0];

        System.out.println("Maior ="+maior+"\nMenor="+menor);
   }
}
