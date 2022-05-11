package interviewQuestions1;

import java.util.Scanner;

public class Q03 {
    /*
     Ask user enter a positive number and check if it is prime or not
     Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi <= 0) {
            System.out.println("pozitif sayi girmediniz!");
        } else {
            int count = 0;
            for (int i = 0; i < sayi; i++) {
                if (sayi % (i + 1) == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(sayi + " asal sayidir");
            } else System.out.println(sayi + " asal sayi degil");
        }


    }
}
