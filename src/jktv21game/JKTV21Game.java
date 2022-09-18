/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number, imput, n = 0;
        int money = 5;
        String repeat = "y";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            number = random.nextInt(4)+1;
            System.out.printf("Guess number [1-5]:%n");
            do {
               System.out.printf("%d$ > ", money);
               imput = scanner.nextInt();
               ++n;
               if (number != imput) {
                   --money;
               } else {
                   ++money;
               }
            } while (number != imput && money > 0);
            if (money > 0) {
                System.out.printf("Yes! You have %d$.%nNew Game? [y,n] ", money);
                repeat = scanner.next();
            }
        } while (repeat.equals("y") &&  money > 0);
        System.out.printf("End Game!%nYou have %d$.%n", money);
    }
}