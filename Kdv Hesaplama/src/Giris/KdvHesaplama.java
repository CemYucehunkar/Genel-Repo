package Giris;
import java.util.Scanner;
class KDVHesaplama {

    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutar, kdvliTutar;


        Scanner input=new Scanner(System.in);
        System.out.print("Ücret Tutarı Giriniz: ");
        tutar=input.nextDouble();


        kdvOran=tutar<1000 ? 0.08 : 0.18;

        System.out.print("KDV Tutarı=");
         kdvTutar=(tutar*kdvOran);
         System.out.println(kdvTutar);

        System.out.print("Kdv'li Tutar=");
        kdvliTutar=kdvTutar+tutar;
        System.out.print(kdvliTutar);

    }

}
