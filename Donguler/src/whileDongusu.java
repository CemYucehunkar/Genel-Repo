import java.util.Scanner;

public class whileDongusu {
    public static void main(String[] args) {

        int password;

        boolean isPasswordSucces = true;

        Scanner input = new Scanner(System.in);

        while (isPasswordSucces) {
            System.out.print("Şifre Giriniz : ");
            password = input.nextInt();

            if (password == 123){
                System.out.println("Doğru Giriş Yaptınız");
                isPasswordSucces=false;


            }else {
                System.out.println("Yanlış Giriş Yaptınız");
            }
        }

    }

}