package Soru9;

import java.util.Scanner;

public class Soru9 {
    public Soru9() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("GEOMETRIK SEKILLER: -Dikdortgen -Kare -Ucgen ");
        System.out.println("Alanini Hesaplamak İstediginiz Sekli Giriniz:");
        switch (scan.next()) {
            case "dikdortgen":
                System.out.println("Kenar uzunlugunu giriniz:");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Sonuc:" + a * b);
                break;
            case "kare":
                System.out.println("Kenar uzunlugunu giriniz:");
                int c = scan.nextInt();
                System.out.println("Sonuc:" + c * c);
                break;
            case "ücgen":
                System.out.println("Taban uzunlugunu giriniz:");
                int x = scan.nextInt();
                System.out.println("Yüksekligi giriniz:");
                int y = scan.nextInt();
                System.out.println("Sonuc:" + x * y / 2);
                break;
            default:
                System.out.println("lütfen gecerli bir sekil giriniz!!!");
        }

    }
}
