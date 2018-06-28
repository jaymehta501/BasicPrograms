package Practice;

public class printPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 100; i++) {
			
			int flag = 0;
			
			for (int p = 2 ; p < i; p++) {
				
				if ((i % p == 0) && (i != p)) {
					flag = 1;
					break;
				}
			}
			
			if (flag == 0) {
				System.out.print(i + " ");
			}
		
		}
		
	}

}
