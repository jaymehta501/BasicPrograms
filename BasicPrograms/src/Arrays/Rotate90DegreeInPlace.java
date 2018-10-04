package Arrays;

/**
 * Rotate90Degree In Place An N x N
 * matrix will have floor(N/2) square
 * cycles The first cycle is formed by
 * its 1st row, last column, last row
 * and 1st column. The second cycle is
 * formed by 2nd row, second-last
 * column, second-last row and 2nd
 * column.
 * 
 * The idea is for each square cycle, we
 * swap the elements involved with the
 * corresponding cell in the matrix in
 * anti-clockwise direction i.e. from
 * top to left, left to bottom, bottom
 * to right and from right to top one at
 * a time.
 * 
 * 
 *
 */
public class Rotate90DegreeInPlace {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println("Input");
		Rotate90DegreeInPlace.printMatrix(array);
		System.out.println("Output");
		rotateClockWise(array);
		Rotate90DegreeInPlace.printMatrix(array);

	}

	public static void rotateClockWise(int[][] mat) {
		int N = mat.length;
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - i - 1; j++) {
				// store current cell in temp variable
				int temp = mat[i][j];

				// move values from right to top
				mat[i][j] = mat[j][N - 1 - i];

				// move values from bottom to right
				mat[j][N - 1 - i] = mat[N - 1 - i][N - 1 - j];

				// move values from left to bottom
				mat[N - 1 - i][N - 1 - j] = mat[N - 1 - j][i];

				// assign temp to left
				mat[N - 1 - j][i] = temp;
			}
		}
	}

	public static void printMatrix(int[][] array) {
		int length = array.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
}
