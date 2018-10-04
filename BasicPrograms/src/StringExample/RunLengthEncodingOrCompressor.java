package StringExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Time Complexity: O(n)
 * 
 *
 */
public class RunLengthEncodingOrCompressor {

	public static String encode(String source) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
			int runLength = 1;
			while (i + 1 < source.length() && source.charAt(i) == source.charAt(i + 1)) {
				runLength++;
				i++;
			}
			result.append(runLength);
			result.append(source.charAt(i));
		}
		return result.toString();
	}

	public static String decode(String source) {
		StringBuffer dest = new StringBuffer();
		Pattern pt = Pattern.compile("[0-9]+|[a-zA-Z]");
		Matcher matcher = pt.matcher(source);
		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			matcher.find();
			while (number-- != 0) {
				dest.append(matcher.group());
			}
		}
		return dest.toString();
	}

	public static void main(String[] args) {
		String example = "aaaaabbbbbcccccr";
		System.out.println(encode(example));
		System.out.println(decode(encode(example)));
	}
}
