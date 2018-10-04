package StringExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MissingWords {

	public static void main(String[] args) {
		String str = "I am using HackerRank to improve programming";
		String str2 = "am HackerRank to improve";
		String[] result = missingWordsMap(str, str2);

	}

	static String[] missingWordsMap(String str, String str2) {
		Set<String> set = new HashSet<String>();
		String st[] = str.split(" ");
		String st2[] = str2.split(" ");
		List<String> rest = new ArrayList<String>();

		for (String strin : st2) {
			set.add(strin);
		}
		for (String strin : st) {
			if (set.contains(strin)) {

			} else {
				rest.add(strin);
			}
		}
		String[] resultArray = rest.toArray(new String[0]);
		return resultArray;
	}

	public static String[] missingwordss(String t, String s) {

		String[] a = t.split(" ");
		String[] b = s.split(" ");
		int sz = a.length - b.length;
		String[] missing = new String[sz];
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j]))
					flag = 1;
			}
			if (flag == 0) {
				missing[c++] = a[i];

			}
		}
		return missing;

	}

	static String[] missingWords(String str, String str2) {

		String words[] = str.split(" ");
		String words2[] = str2.split(" ");
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < words.length; i++) {
			int flag = 0;
			for (int j = 0; j < words2.length; j++) {

				if (words[i].equals(words2[j])) {
					flag = 1;
					words2[j] = "";
					break;
				}
			}
			if (flag == 0) {
				//result[i] =words[i];
				result.add(words[i]);
				System.out.print(" " + words[i]);
			}
		}
		System.out.println();
		String[] resultArray = result.toArray(new String[0]);
		return resultArray;
	}
}
