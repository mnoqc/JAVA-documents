package loop;

public class ForDemo9 {
	public static void main(String[] args) {
		
		/*
		 * 1 
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 * 5 5 5 5 5
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	
	/*
	 * 1 1 1 1 1
	 * 2 2 2 2
	 * 3 3 3
	 * 4 4 
	 * 5 
	 */
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 6-i; j++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println();
	
	/*
	 * 1
	 * 2 3
	 * 4 5 6
	 * 7 8 9 10
	 * 11 12 13 14 15
	 */
	
	int x = 1;
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(x);
			System.out.print(" ");
			x++;
		}
		System.out.println();
	}
	System.out.println();
	
	}	
}

