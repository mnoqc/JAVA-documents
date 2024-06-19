package loop;

public class ForDemo8 {
	public static void main(String[] args) {
		
		// 구구단 출력하기
		/*
		 * 2*1=2 3*1=3 4*1=4 ... 9*1=9 
		 * 2*2=4 3*2=6 4*2=8 ... 9*2=18 
		 * ...	 ...   ...	 ... ...
		 * 2*9=18 3*9=27 4*9=36 ... 9*9=81 
		 */
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t"); // "\t"
			}
			System.out.println();
		}
	}

}
