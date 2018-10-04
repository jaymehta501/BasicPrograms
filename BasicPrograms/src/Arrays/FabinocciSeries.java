package Arrays;

public class FabinocciSeries {

	int n1 = 0;
	int n2 = 1;
	int n3 = 0;

	void printFab(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFab(count - 1);
		}
	}

	public static void main(String[] args) {
		FabinocciSeries fb = new FabinocciSeries();
		int count = 10;
		System.out.print("Fabonaci Series :: ");
		fb.printFab(count - 2);

	}
}
