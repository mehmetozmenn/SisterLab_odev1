package Soru7;

import java.util.Scanner;

public class Soru7 {
    public Soru7() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KODLAR: -TT115 -TT135 -TT145 -TT155 -TT165");
        System.out.println("Kodu Giriniz:");
        switch (scan.next()) {
            case "TT115":
                System.out.println("Hava Durumu: 20 Derece");
                break;
            case "TT135":
                System.out.println("Hava Durumu: 25 Derece");
                break;
            case "TT145":
                System.out.println("Hava Durumu: 30 Derece");
                break;
            case "TT155":
                System.out.println("Hava Durumu: 35 Derece");
                break;
            case "TT165":
                System.out.println("Hava Durumu: 40 Derece");
                break;
            default:
                System.out.println("Lutfen gecerli bir kod giriniz.");
        }

    }
}
