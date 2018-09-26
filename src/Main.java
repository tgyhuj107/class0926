import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int str = scn.next().charAt(0);
//        System.out.println(Integer.toHexString(str));
        String str1 = scn.next();
        int a=Integer.parseInt(str1,16);
        System.out.println((char)a);


    }
}
