package Soru1;

import java.util.Scanner;

public class Soru1 {
    public Soru1() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen KDV'sini hesaplamak istediğiniz para miktarını yazınız:");
        int number = scan.nextInt();
        int number2 = number * 30 / 100;
        System.out.println("KDV Tuturi = %30");
        System.out.println("KDV'siz Fiyat:" + number);
        System.out.println("KDV'li Fiyat:" + (number2 + number));
        System.out.println("KDV Tutari:" + number2);
    }
}