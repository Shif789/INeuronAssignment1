
public class Vowelconstantcount {

	public static void main(String[] args) {
		String s = "abcdefg#*hijklmnopqrstuvwxyz@##";
		s = s.toLowerCase().replace(" ", "");
		int vowel = 0;
		int consonant = 0;
		int special_char = 0;
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			int x = s.charAt(i);
			if (x == 97 || x == 101 || x == 105 || x == 111 || x == 117) {
				vowel++;
			} else if ((x >= 97 && x <= 122) && (x != 97 && x != 101 && x != 105 && x != 111 && x != 117)) {
				consonant++;
			} else {
				special_char++;
			}
		}

		System.out.println("The number of vowels are : " + vowel);
		System.out.println("The number of consonants are : " + consonant);
		System.out.println("The number of special_char are : " + special_char);
	}

}
