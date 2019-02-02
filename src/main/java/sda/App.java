package sda;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        int i = 0;
//        nieparzysta(7);
        Scanner wprowadzanie = new Scanner(System.in);
        i = wprowadzanie.nextInt();

        System.out.println(i);
        System.out.println(i);

    }


    public static void nieparzysta (int i) {
        if (i % 2 == 1) {
            System.out.println("liczba nieparzysta");;}
        else{
            System.out.println("liczba parzysta");}

    }





}

