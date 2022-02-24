package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LaFinta laFinta = new LaFinta(450, 640);
        Peperoni pepperoni = new Peperoni(487, 710);
        Margarita margarita = new Margarita(570, 600);
        int point;
        do {
            System.out.println("1.Пицца № 3: Ла-Финта (с грибами)");
            System.out.println("2. Пицца № 1: Пепперони (не острая)");
            System.out.println("3. Пицца № 2:  Пеперонни острая ");
            System.out.println("4. Пицца № 2 Маргарита (без мяса)");
            System.out.println("5.Пицца № 1: Маргарита (с мясом)");
            System.out.println("6. Пицца № 3: Ла-Финта (без грибов)");
            System.out.println( );
            System.out.println("Закажите пиццу : ");
            point = sc.nextInt();
            switch (point){
                case 1:
                    pepperoni.cookSpicy();
                    pepperoni.deliver();
                    break;
                case 2:
                    pepperoni.cook();
                    pepperoni.deliver();
                    break;
                case 3:
                    margarita.cookWithMeat();
                    margarita.deliver();
                    break;
                case 4:
                    margarita.cookWithoutMeat();
                    margarita.deliver();
                    break;
                case 5:
                    laFinta.cookWithMushrooms();
                    laFinta.deliver();
                    break;
                case 6:
                    laFinta.cookWithoutMushrooms();
                    laFinta.deliver();
                    break;
            }
        } while (point == 0);
    }
}


