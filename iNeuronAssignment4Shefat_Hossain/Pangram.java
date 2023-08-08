import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        String s3 = s1.replace(" ", "");
        System.out.println(s3);

        char[] char1 = s3.toCharArray();
        int[] newArr = new int[26];
        boolean flag = false;

        // System.out.println(Arrays.toString(char1));
        for (int i = 0; i < char1.length; i++) {
            // int index = char1[i] - 65;
            // newArr[index]++;

            newArr[char1[i] - 65]++;
        }
        // System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 0) {
                System.out.println("It is not pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("It is pangram");
        }
    }
}
