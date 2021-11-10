package Main;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            List<String> num = new ArrayList<>();
            float media = 0;
            int maior=0;
            int menor=0;


            num.add("50");
            num.add("20");
            num.add("30");
            num.add("20");
            num.add("120");
            num.add("60");
            num.add("70");


            for (int i=0; i<num.size(); i++) {
                Integer.parseInt(num.get(i));
                int numero = Integer.parseInt(num.get(i));
                media += numero;
            }
             media = media/7;
             System.out.println(media);

        for (int i = 0;i < num.size();i++){

            if(i == 0){
                maior = Integer.valueOf(num.get(i));
                menor = Integer.valueOf(num.get(i));
            }
            if(maior < Integer.valueOf(num.get(i))){
                maior = Integer.valueOf(num.get(i));
            }
            if(menor > Integer.valueOf(num.get(i))){
                menor = Integer.valueOf(num.get(i));
            }
        }


        System.out.println("maior"+maior+"menor"+menor);
        }

    }

