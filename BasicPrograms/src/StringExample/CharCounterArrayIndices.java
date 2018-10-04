package StringExample;

public class CharCounterArrayIndices {

	public static int[] charCount(String str) {
		int[] indexes = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			indexes[c - 'a']++;
		}
		return indexes;
	}

	void print(int[] indexes) {
		for (int in : indexes) {

		}

	}

	public static void main(String[] args) {
		int[] res = charCount("aaabcbddddaddddddddddddddd");
		for (Integer in : res) {
			if (in % 3 == 0) {
				int total = in / 3;
				System.out.println(total);
			}
		}
	}
}
