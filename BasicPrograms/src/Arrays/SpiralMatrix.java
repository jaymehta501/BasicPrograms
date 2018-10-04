package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * * Solution: Keep 4 pointers which are
 * bounds for this matrix, up, down,
 * left, right. Print each row or column
 * and keep incrementing and
 * decrementing the bounds. As soon as
 * up meets down or left meets right we
 * are done.
 * 
 * 
 *
 */
public class SpiralMatrix {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		SpiralMatrix display = new SpiralMatrix();
		List<Integer> ls = display.spiralOrder(arr);

		for (Integer in : ls) {
			System.out.print(in + " ");
		}
	}

	public List<Integer> spiralOrder(int[][] matrix) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return Collections.EMPTY_LIST;
		}
		List<Integer> result = new ArrayList<Integer>();
		int left = 0;
		int right = matrix[0].length - 1;
		int up = 0;
		int down = matrix.length - 1;
		while (left <= right && up <= down) {
			for (int i = left; i <= right; i++) {
				result.add(matrix[up][i]);
			}
			up++;

			for (int i = up; i <= down; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			if (up <= down) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[down][i]);
				}
			}
			down--;

			if (left <= right) {
				for (int i = down; i >= up; i--) {
					result.add(matrix[i][left]);
				}
			}
			left++;
		}
		return result;
	}
}