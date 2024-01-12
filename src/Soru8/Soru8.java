package Soru8;

import java.util.Scanner;

public class Soru8 {
    public Soru8() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi gir:");
        double number = scan.nextDouble();
        System.out.println("İkinci sayiyi gir:");
        double number2 = scan.nextDouble();
        System.out.println("yapmak istediğin işlemi gir. +,-,/,*");
        char islem = scan.next().charAt(0);
        double sonuc = 0.0;
        switch (islem) {
            case '*':
                sonuc = number * number2;
                break;
            case '+':
                sonuc = number + number2;
                break;
            case ',':
            case '.':
            default:
                System.out.println("Hatali islem");
                break;
            case '-':
                sonuc = number - number2;
                break;
            case '/':
                if (number2 == 0.0) {
                    System.out.println("hata Taban 0 olamaz");
                } else {
                    sonuc = number / number2;
                }
        }

        System.out.println("sonuc:" + sonuc);
    }
}
