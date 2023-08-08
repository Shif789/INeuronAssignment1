import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();

        char[] char1 = s3.toCharArray();
        char[] char2 = s4.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        if (Arrays.equals(char1, char2)) {
            System.out.println(s1 + " and " + s2 + " are anagram");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagram");
        }
    }
}
