package StringExample;

/**
 * Apply Modified binary search. Like
 * normal binary search, we compare
 * given str with middle string. If
 * middle string is empty, we find the
 * closest non-empty string x (by
 * linearly searching on both sides).
 * Once we find x, we do standard binary
 * search, i.e., we compare given str
 * with x. If str is same as x, we
 * return index of x. if str is greater,
 * we recur for right half, else we
 * recur for left half.
 * 
 * 
 *
 */
public class SearchInArrayNonEmptyStringsSorted {
	public static int search(String[] strings, String str, int first, int last) {
		while (first <= last) {
			// Ensure there is something at the end
			while (first <= last && strings[last] == "") {
				--last; //ignore empty entries.
			}
			if (last < first) {
				return -1; // this array was empty, so fail
			}
			int mid = (last + first) >> 1; //  ()/2 right shift by 1
			while (strings[mid] == "") {
				++mid; // will always find one ， skip empty, getting right one.
			}
			int r = strings[mid].compareTo(str); // useful in situations like Strings etc.
			if (r == 0)
				return mid;
			if (r < 0) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return -1;
	}

	public static int search(String[] strings, String str) {
		if (strings == null || str == null)
			return -1;
		if (str == "") {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i] == "")
					return i;
			}
			return -1;
		}
		return search(strings, str, 0, strings.length - 1);
	}

	public static void main(String[] args) {
		String arr[] = { "for", "", "", "", "geeks", "ide", "", "practice", "", "", "quiz", "", "" };
		String str = "quiz";
		System.out.println(search(arr, str));
	}

}
