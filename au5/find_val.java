//Write a Java Program that to check if a String array contains User given string Value ?

public class find_val {
    public static void main(String[] args) {
        String[] a = { "abc", "bca", "cab" };
        boolean b = false;
        String s = "abc";
        for (String f : a) {
            if (f.equals(s)) {
                b = true;
                System.out.println("found");
                break;
            }
        }
        if (!b) {
            System.out.println("not found");
        }
    }
}
