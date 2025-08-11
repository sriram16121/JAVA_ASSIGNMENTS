import java.util.*;
class Anagarm{
    public static void main(String[]ars){
        String a="dad";
        String b="add";
        char [] a_a=a.toCharArray();
        char [] b_a=b.toCharArray();
        Arrays.sort(a_a);
        Arrays.sort(b_a);
        if(Arrays.equals(a_a,b_a)){
            System.out.println("Anagaram");
        }
        else{
            System.out.println("non anagaram");
        }
    }
}