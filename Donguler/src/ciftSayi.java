import java.util.Scanner;

public class ciftSayi {
    public static void main(String[] args) {

        int k;


        System.out.print("Bir Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();

        int i = 1;
        while (i < k) {
            if (i % 2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

