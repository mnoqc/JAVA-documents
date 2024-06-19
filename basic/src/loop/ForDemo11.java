package loop;

public class ForDemo11 {
	public static void main(String[] args) {
		
		/* i 별		start
		 * 1 *		1
		 * 2 **		2
		 * 3 ***	3
		 * 4 ****	4
		 * 5 *****	5
		 * -----------------
		 * 			i <--- 한 줄당 별 출력 개수
		 */
		
		for (int i = 1; i <= 5; i++) {		// 별을 5줄 출력하자.
			for (int j = 1; j <= i; j++) {	// 한 줄당 별은 i만큼 출력하자.
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/* i 별		start
		 * 1 *****	5
		 * 2 ****	4
		 * 3 ***	3
		 * 4 **		2
		 * 5 *		1
		 * -----------------
		 * 			(5 - i) + 1 <--- 한 줄당 별 출력 개수
		 */
		
		for (int i = 1; i <= 5; i++) {		// 별을 5줄 출력하자.
			for (int j = 1; j <= (5 - i) + 1; j++) {	// 한 줄당 별은 i만큼 출력하자.
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
	/* i 별		start
	 * 1     *	5
	 * 2    **	4
	 * 3   ***	3
	 * 4  ****	2
	 * 5 *****	1
	 * -----------------
	 * 			(5 - i) + 1 <--- 한 줄당 별 출력 개수
	 */
		for (int i = 1; i <= 5; i++) {
		// 공백 출력
		for (int j = 1; j <= 5 - i; j++) {	
			System.out.print(" ");
		}
		// 별 출력
		for (int k= 1; k <= 5 - i + 1; k++) {	
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	/* i 			space	star
	 * 1 ____*		4		1
	 * 2 ___***		3		3
	 * 3 __*****	2		5
	 * 4 _*******	1		7
	 * 5 *********	0		9
	 * -----------------	
	 * 				5 - i	i*2 - 1
	 */

	int lines = 10;
	for (int i = 1; i <= lines; i++) {		// 별을 n줄 출력하자.
		// 공백 출력
		for (int j = 1; j <= lines - i; j++) {	
			System.out.print(" ");
		}
		// 별 출력
		for (int k= 1; k <= i*2 - 1; k++) {	
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
}
	

}
