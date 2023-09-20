import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {

        int pass;
        boolean askPassword=true;

        Scanner input=new Scanner(System.in);

        do{
            System.out.print("Şifre Giriniz : ");
            pass=input.nextInt();

            if(pass==123){
                System.out.print("Doğru");
                askPassword=false;
            }else{
                System.out.println("Tekrar Deneyiniz");
            }


        }while (askPassword);


    }
}
