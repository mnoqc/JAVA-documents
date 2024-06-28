package demo7;

import java.text.DecimalFormat;

public class DecimalFormatApp1 {

	public static void main(String[] args) {
		
		/*
		 * DecimalFormat
		 *  - 숫자(정수 혹은 실수)를 지정된 패턴의 문자열로 변환한다.
		 *  - 숫자형식의 문자열을 숫자(정수 혹은 실수)로 변환한다.
		 *  - 주요 API
		 *  	생성자
		 *  		DecimalFormat(String pattern)
		 *  			+ 지정된 패턴으로 객체를 초기화한다.
		 *  	메소드
		 *  		String format(double value)
		 *  			+ 전달받는 실수를 지정된 패턴의 문자열로 변환해서 반환한다.
		 *  		String format(long value)
		 *  			+ 전달받은 정수를 지정된 패턴의 문자열로 변환해서 반환한다.
		 *  		Number parse(String text)
		 *  			+ 지정된 패턴형식으로 작성된 문자열을 해석해서 Number객체로 반환한다.
		 *  			+ Number는 Integer, Long, Double, BigDecimal, BigInteger 등의
		 *                부모클래스다.
		 *                
		 *  - 패턴 문자
		 *  	0	숫자하나를 나타낸다.
		 *  	#   숫자하나를 나타낸다.
		 *  	.   소숫점을 나타낸다.
		 *  	,   자릿수를 구분한다.
		 *  
		 *  	0은 해당 위치에 숫자가 없어도 0을 표시한다.
		 *  	#은 해당 위치에 숫자가 없으면 무시한다.
		 */
		
		DecimalFormat formatter1 = new DecimalFormat("##,###");
		String text1 = formatter1.format(100000000);
		System.out.println(text1);
		
		DecimalFormat formatter2 = new DecimalFormat("00,000");
		String text2 = formatter2.format(100000000);
		System.out.println(text2);
		
		DecimalFormat formatter3 = new DecimalFormat("##,###.##");
		String text3 = formatter3.format(123.456789);
		System.out.println(text3);
		
		DecimalFormat formatter4 = new DecimalFormat("##.###");
		String text4 = formatter4.format(12.34);
		System.out.println(text4);
		
		DecimalFormat formatter5 = new DecimalFormat("##.000");
		String text5 = formatter5.format(12.34);
		System.out.println(text5);
		
		
		int total = 100+100+100;
		double average = total/3.0;
		System.out.println(average);
		
		DecimalFormat formatter6 = new DecimalFormat("##0.0");
		String text6 = formatter6.format(average);
		System.out.println(text6);
	}
}
















