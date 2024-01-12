package Soru3;

import java.util.Scanner;

public class Soru3 {
    public Soru3() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hesaplamak istediğiniz notu yazınız:");
        int number = scan.nextInt();
        if (number >= 90 && number <= 100) {
            System.out.println("Notunuz:AA");
        } else if (number >= 80 && number < 90) {
            System.out.println("Notunuz:BA");
        } else if (number >= 70 && number < 80) {
            System.out.println("Notunuz:BB");
        } else if (number >= 60 && number < 70) {
            System.out.println("Notunuz:CB");
        } else if (number >= 50 && number < 60) {
            System.out.println("Notunuz:CC");
        } else if (number > 0 && number < 50) {
            System.out.println("Notunuz:FF");
        } else {
            System.out.println("Lütfen geçerli bir not giriniz.");
        }

    }
}
