//1 Writea Java Program that to accept a user input(Scanner Class) of String and try to remove all the white spaces given within that String ?
import java.util.Scanner;
class rmw{
    public static void main(String []ars){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.replaceAll(" ",""));
    }
}