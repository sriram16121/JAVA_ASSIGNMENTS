
//Write a Java Program that to Create a Single-Dimensional String array and try to sort that array in Descending Order alphabetically ?
import java.util.*;

public class desc_sort_string {
    public static void main(String[] args) {
        String[] sa = { "abc", "bca", "afhsdh" };
        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println(Arrays.toString(sa));
    }
}
