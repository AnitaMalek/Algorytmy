package sda;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
//zad.1 i 2
Scanner keyboard = new Scanner(System.in);
Kalkulator kalk = new Kalkulator();
        System.out.println("Insert value: ");

int a = keyboard.nextInt();
        System.out.println("Value" + a + "is even: " + kalk.isEven(a));

        //zad.3
        System.out.println("Insert a: ");
        int valueA = keyboard.nextInt();
        System.out.println("Insert b: ");
        int valueB = keyboard.nextInt();
        System.out.println("Insert c: ");
        int valueC = keyboard.nextInt();

        System.out.println("Sum of even value: " + kalk.sumIsEven(valueA, valueB, valueC));





    }


}










