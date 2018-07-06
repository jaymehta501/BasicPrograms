package StringExample;

public class SortString {

	public static void main(String[] args) {

		String original = "hiallhelloworld";
		int j = 0;
		char temp = 0;

		char[] chars = original.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			for (j = 0; j < chars.length; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}
		
		String str = new String(chars);
		System.out.println(str);

		/*
		for (int k = 0; k < chars.length; k++) {
			System.out.println(chars[k]);
		} */

	}
}
