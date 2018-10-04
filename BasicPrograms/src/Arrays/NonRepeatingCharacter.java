package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	/**
	 * HashMap
	 */

	public static Integer nonRepeatingInt(int[] a) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], count);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer value = entry.getValue();
			if (value == 0) {
				return entry.getKey();
			}
		}
		return 0;
	}

	/**
	 * Below method will not work if any
	 * number is repeating odd time The
	 * key to solve this problem is bit
	 * manipulation. XOR will return 1
	 * only on two different bits. So if
	 * two numbers are the same, XOR
	 * will return 0. Finally only one
	 * number left.
	 * 
	 * @param A
	 * @return
	 */
	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 3, 3, 4, 4, 6, 6, 7, 8, 8 };
		System.out.println(singleNumber(a));
		System.out.println(nonRepeatingInt(a));
	}

}
