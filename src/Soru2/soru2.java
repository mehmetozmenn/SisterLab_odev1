
package Soru2;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen KDV'sini hesaplamak istediğiniz para miktarını yazınız:");
        int number = scan.nextInt();
        int kdv;
        if (number > 0 && number < 1000) {
            kdv = number * 10 / 100;
            System.out.println("KDV Tuturi = %10");
            System.out.println("KDV'siz Fiyat:" + number);
            System.out.println("KDV'li Fiyat:" + (kdv + number));
            System.out.println("KDV Tutari:" + kdv);
        } else if (number > 1000) {
            kdv = number * 22 / 100;
            System.out.println("KDV Tuturi = %22");
            System.out.println("KDV'siz Fiyat:" + number);
            System.out.println("KDV'li Fiyat:" + (kdv + number));
            System.out.println("KDV Tutari:" + kdv);
        } else {
            System.out.println("Lütfen geçerli bir rakam giriniz.");
        }

    }
}
