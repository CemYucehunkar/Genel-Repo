import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;


        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Seçiniz:");
        n1 = input.nextInt();

        System.out.print("2.Sayıyı Seçiniz:");
        n2 = input.nextInt();

        System.out.println("Yapacağınız işlemi Seçiniz \n Toplama:1 \n Çıkartma:2 \n Çarpma:3\n Bölme:4");
        System.out.print("Seçiminiz :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print(n1 + n2);
                break;

            case 2:
                System.out.print(n1 - n2);
                break;

            case 3:
                System.out.print(n1 * n2);
                break;

            case 4:
                if (n2 == 0) {
                    System.out.print("Bir sayı sıfıra bölünemez.");
                } else {
                    System.out.print(n1 / n2);
                }


            default:
                System.out.print("Yanlış bir sayı girdiniz. Tekrar deneyiniz.");

        }

    }
}