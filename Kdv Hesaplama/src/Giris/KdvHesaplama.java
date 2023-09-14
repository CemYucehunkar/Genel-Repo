package Giris;
import java.util.Scanner;
class KDVHesaplama {

    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("Ücret Tutarı Giriniz: ");
        tutar=input.nextDouble();

        System.out.print("KDV Tutarı=");
        double kdvTutar=(tutar*kdvOran);
        System.out.println(kdvTutar);

        System.out.print("Kdv'li Tutar=");
        double kdvliTutar=kdvTutar+tutar;
        System.out.print(kdvliTutar);

    }

}
