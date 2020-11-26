
import java.util.Scanner;

public class register {

    public static void main(String Hesap_bilgileri[]) {
        Scanner scn = new Scanner(System.in);
        String kişi_adi,parola;
        System.out.print("Kullanıcı Adınız");
        kişi_adi=scn.nextLine();
        System.out.print("parolanızı giriniz");
        parola=scn.nextLine();
        if (kişi_adi.equals("Burak") && parola.equals("123")) {
            System.out.println("girişiniz başarılı");
        }else if(kişi_adi.equals("hamza") && parola.equals("123")){
            System.out.println("girişiniz başarılı");
        }else if(kişi_adi.equals("Meral") && parola.equals("123")) {
            System.out.println("girişiniz başarılı");
        }else if(kişi_adi.equals("tuce") && parola.equals("123")) {
            System.out.println("girişiniz başarılı");
        }else if (kişi_adi.equals("burak") && parola.equals( "123")) {
            System.out.println("girişiniz başarılı");
        }else if(kişi_adi.equals("nevin") && parola.equals("123")) {
            System.out.println("girişiniz başarılı");
        }else if(kişi_adi.equals("aslan") && parola.equals("123")) {
            System.out.println("girişiniz başarılı");
        }



    }
}

// System.out.println("Malesef yanlış şifre veya yanlış kullanıcı adı girdiniz");
