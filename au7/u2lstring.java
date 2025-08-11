//Write a Java Program that to Convert all uppercase letters into  lowercase and lowercase letters into uppercase in String ?

public class u2lstring {
    public static void main(String[] args) {
        String s = "AbCdEf";
        String u = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                u = u + (char) (s.charAt(i) - 32);
            } else {
                u = u + (char) (s.charAt(i) + 32);
            }
        }
        System.out.println(u);
    }
}
