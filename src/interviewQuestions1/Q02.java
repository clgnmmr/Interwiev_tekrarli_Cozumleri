package interviewQuestions1;

import java.util.Scanner;

public class Q02 {/*
 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
 * return eden metod yaziniz
 *
 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str = scan.next();
        System.out.print("Tekrar edilecek miktar giriniz: ");
        int tekrarSayisi = scan.nextInt();

        String newStr = "";
        for (int i = 0; i < tekrarSayisi; i++) {
            newStr += "" + str.charAt(0) + str.charAt(str.length() - 1);
        }
        System.out.println(newStr);


    }
}
