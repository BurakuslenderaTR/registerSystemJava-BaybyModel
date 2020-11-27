
import java.util.Scanner;

public class register {

    public static void main(String Register[]) {
        Scanner scn = new Scanner(System.in);
        String user,pasword;
        System.out.print("User Name");
        user=scn.nextLine();
        System.out.print("pasword");
        pasword=scn.nextLine();
        if (kişi_adi.equals("Burak") && pasword.equals("123")) {
            System.out.println("your login is successful");
        }else if(user.equals("Manyak") && pasword.equals("228")){
            System.out.println("your login is successful");
        }else if(user.equals("Meral") && pasword.equals("12345")) {
            System.out.println("your login is successful");
        }else if(user.equals("tuce") && pasword.equals("123456")) {
            System.out.println("your login is successful");
        }else if (user.equals("Mustafa") && pasword.equals( "2208")) {
            System.out.println("your login is successful");
        }else if(user.equals("Murat") && pasword.equals("1234567")) {
            System.out.println("your login is successful");
        }else if(user.equals("aslan") && paswaord.equals("12346578")) {
            System.out.println("your login is successful");
        }else {
            System.out.prinln("Pls try again");
        }
    }
}


