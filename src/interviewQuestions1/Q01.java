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

        for (int i = 1; i <arr.length ; i++) {

                if (arr[i-1].equalsIgnoreCase(arr[i])) {
                    sayac++;

                }else {
                    System.out.print(arr[i - 1]+"="+(sayac+1)+" ");
                    sayac =0;
                }

                if (i==arr.length - 1) {
                    System.out.print(arr[i - 1]+"="+(sayac+1)+" ");
                }


        }




     /*     List<String> harf = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {

            harf.add(arr[i]);

        }

      for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <harf.size() ; j++) {

                if (arr[i].equalsIgnoreCase(harf.get(j))){
                    sayac++;
                    harf.remove(j);
                }

            }

                System.out.print(harf.get(i)+"="+(sayac)+" ");

            sayac=0;

        }*/






    }

}
