import java.util.Arrays;

public class anagrams2 {
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "tea";

        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        System.out.println(Arrays.equals(s1arr,s2arr ));
    }
}
