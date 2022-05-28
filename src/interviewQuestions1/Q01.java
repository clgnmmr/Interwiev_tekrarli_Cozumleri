package interviewQuestions1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen bir string giriniz :");
        String str=scan.nextLine();

        String [] arr=str.split("");

        Arrays.sort(arr);

        int sayac=0;

     /*   for (int i = 1; i <arr.length ; i++) {

                if (arr[i-1].equalsIgnoreCase(arr[i])) {
                    sayac++;

                }else {
                    System.out.print(arr[i - 1]+"="+(sayac+1)+" ");
                    sayac =0;
                }

                if (i==arr.length - 1) {
                    System.out.print(arr[i - 1]+"="+(sayac+1)+" ");
                }


        }*/



        System.out.println("duzeltme yapılıyor");



          List<String> harf = new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {

            }
        }
                List<String> tekrarsizharfler = new ArrayList<>();

                for (int i = 0; i < harf.size(); i++) {
                    if (!tekrarsizharfler.contains(harf.get(i))) {
                        tekrarsizharfler.add(harf.get(i));
                    }

                }
                System.out.println(tekrarsizharfler);


            }

        }


