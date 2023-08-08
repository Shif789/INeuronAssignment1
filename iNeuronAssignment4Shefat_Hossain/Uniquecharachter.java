class Uniquecharachter {
	public static void main(String[] args) {
		int count = 0;
		String s = "hi";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

		}

		if (count == 0)
			System.out.println("This is a unique charachter String");
		else
			System.out.println("This is not a unique charachter String");
	}
}