package Arrays;

import java.util.PriorityQueue;

/**NK log k
 * O(N log N) N is the total number of
 * integers. k is the number of arrays.
 * Heap Priority Queue
 * 
 * 
 *his problem can be solved by using a heap. The time is O(nlog(n)).
 */
public class MergeKSortedArrays implements Comparable<MergeKSortedArrays> {

	int val;
	int arrNum;
	int index;

	public MergeKSortedArrays(int val, int arrNum, int index) {
		this.val = val;
		this.arrNum = arrNum;
		this.index = index;
	}

	@Override
	public int compareTo(MergeKSortedArrays o) {
		return this.val - o.val;
	}

	public static int[] mergeKSortedArray(int[][] arr) {
		PriorityQueue<MergeKSortedArrays> queue = new PriorityQueue<MergeKSortedArrays>(arr.length);
		int total = 0;

		//add arrays to heap
		for (int i = 0; i < arr.length; i++) {
			queue.add(new MergeKSortedArrays(arr[i][0], i, 0));
			total += arr[i].length;
		}

		int m = 0;
		int result[] = new int[total];
		//while heap is not empty
		while (!queue.isEmpty()) {
			MergeKSortedArrays ac = queue.poll();
			result[m++] = ac.val;
			if (ac.index < arr[ac.arrNum].length - 1) {
				queue.add(new MergeKSortedArrays(arr[ac.arrNum][ac.index + 1], ac.arrNum, ac.index + 1));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[] res = mergeKSortedArray(arr1);
		for (Integer in : res) {
			System.out.println(in);
		}
	}
}
