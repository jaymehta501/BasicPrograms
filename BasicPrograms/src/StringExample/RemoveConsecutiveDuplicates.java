package StringExample;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usr1 = "aaabcdeeefghiiijkllllllmnnn";
		int num1 = 3;

		removeConsecutiveDuplicates(usr1, num1);
	}

	public static void removeConsecutiveDuplicates(String usr1, int num1) {

		for (int i = 0; i < usr1.length(); i++) {

			char temp = usr1.charAt(i);

			if (i != usr1.length() && usr1.charAt(i + 1) == temp) {

				if (i != usr1.length() && usr1.charAt(i + 2) == temp) {

					i = i + 2;
				}

			} else {

				System.out.print(usr1.charAt(i));
			}

		}

	}
}
