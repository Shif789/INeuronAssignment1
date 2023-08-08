
public class Removeduplicates {

	public static void main(String[] args) {
		String s = "Rahuldravid";
		s = s.toLowerCase();
		char c = '\u0000';

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {

					s = s.replace(s.charAt(i), c);
				}

			}

		}
		// s.replace("","" );
		System.out.println(s);

	}

}
