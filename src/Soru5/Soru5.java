package Soru5;

import java.util.Scanner;

public class Soru5 {
    public Soru5() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz sayiyi giriniz:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Girdiginiz sayi cift sayidir.");
        } else {
            System.out.println("Girdiginiz sayi tek sayidir.");
        }

    }
}
