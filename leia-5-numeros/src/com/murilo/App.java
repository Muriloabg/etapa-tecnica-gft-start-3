package com.murilo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numeros = {0, 0, 0, 0, 0,};
        Scanner scanner = new Scanner(System.in);
        int maior;
        int menor;
        double media = 0;

        for(int i = 0; i < 5; i++){
            numeros[i] = scanner.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for(int i = 0; i < 5; i++){
            if(maior < numeros[i]) maior = numeros[i];
            if(menor > numeros[i]) menor = numeros[i];
            media += numeros[i];
        }
        media = media / 5;


        System.out.printf("Maior: %d, Menor: %d Media: %d", maior, menor, media);

        if(maior == menor){
            System.out.println("\n Os numeros são iguais");
        }

    }
}
