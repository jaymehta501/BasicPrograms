package StringExample;

/*import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class StringRecursiveReversal {

	String reverse = "";

	public String reverse(String str) {
		if (str.length() < 1) {
			return str;
		}
		reverse += str.charAt(str.length() - 1);
		reverse(str.substring(0, str.length() - 1));
		return reverse;
	}

	// Without using Temp variable
	public static String reverseWithXOR(String str, int start, int end) {
		char[] ch = str.toCharArray();
		while (start < end) {
			ch[start] ^= ch[end];
			ch[end] ^= ch[start];
			ch[start] ^= ch[end];
			++start;
			--end;
		}
		return ReflectionToStringBuilder.toString(ch);
	}

	public static void main(String[] args) {
		StringRecursiveReversal rev = new StringRecursiveReversal();
		System.out.println(rev.reverse("EMAN"));
		System.out.println(rev.reverseWithXOR("EMAN", 0, 3));
	}

}
*/