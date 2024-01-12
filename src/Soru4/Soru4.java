package Soru4;

import java.util.Scanner;

public class Soru4 {
    public Soru4() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz:");
        int number = scan.nextInt();
        System.out.println("İkinci Sayiyi Giriniz:");
        int number2 = scan.nextInt();
        System.out.println("1- Toplama 2- Çıkarma  3-Çarpma 4-Bölme");
        System.out.println("Yapmak İstediğiniz işlemi Giriniz : ");
        int islem = scan.nextInt();
        if (islem == 1) {
            System.out.println("Sonuc:" + (number + number2));
        } else if (islem == 2) {
            System.out.println("Sonuc:" + (number - number2));
        } else if (islem == 3) {
            System.out.println("Sonuc:" + number * number2);
        } else if (islem == 4) {
            if (number2 == 0) {
                System.out.println("Taban 0 olamaz!!!");
            } else {
                System.out.println("Sonuc:" + number / number2);
            }
        } else {
            System.out.println("Lutfen gecerli bir islem giriniz");
        }

    }
}
