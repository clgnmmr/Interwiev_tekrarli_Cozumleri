package interviewQuestions1;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String pin="ibrahim45";
        int hak=4;
        for (int i = 4; i >0 ; i--) {
            System.out.println("Sifre giriniz "+ i+ " hakkınız var");
            String girilenPin=scan.next();
            if(pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz.");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz");
            }
            if(i==1){
                System.out.println("hakkiniz bitti, bilemediniz");
                break;
            }




        }


    }
}
