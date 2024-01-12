package Soru6;

import java.util.Scanner;

public class Soru6 {
    public Soru6() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz:");
        int number1 = scan.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        int number2 = scan.nextInt();
        System.out.println("ucuncu sayiyi giriniz:");
        int number3 = scan.nextInt();
        if (number1 > number2 && number1 < number3) {
            System.out.println("sonuc:" + number2 + " " + number1 + " " + number3);
        } else if (number2 > number1 && number2 < number3) {
            System.out.println("sonuc:" + number1 + " " + number2 + " " + number3);
        } else if (number3 > number1 && number3 < number2) {
            System.out.println("sonuc:" + number1 + " " + number3 + " " + number2);
        } else if (number1 > number3 && number1 < number2) {
            System.out.println("sonuc:" + number3 + " " + number1 + " " + number2);
        } else if (number2 > number3 && number2 < number1) {
            System.out.println("sonuc:" + number3 + " " + number2 + " " + number1);
        } else if (number3 > number2 && number3 < number1) {
            System.out.println("sonuc:" + number2 + " " + number3 + " " + number1);
        }

    }
}
