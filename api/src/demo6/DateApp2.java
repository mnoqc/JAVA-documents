package demo6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp2 {
	
	public static void main(String[] args) {
		
		/*
		 * SimpleDateFormat
		 * + 문자열을 Date 타입의 객체로 변환하는 기능과
		 * Date 타입의 객체를 지정된 형식의 문자열로 변환하는 기능을 제공한다.
		 * + 주요 API
		 *  생성자
		 *	 SimpleDateFormat()
		 * 	 SimpleDateFormat(String pattern)
		 * 		패턴문자열을 전달받아서 초기화하는 생성자 메소드
		 *  주요 메소드
		 *   String format(Date date)
		 *   
		 *   Date parse(String text)
		 *   
		 * + 패턴 Y  M  d   E	 a 			H 		h 		m   s  S 	 w			 W 			D
		 * 	 문자 년 월 일 요일 오전/오후 24시간제 12시간제 분 초 밀리초 weekInYear WeekInMonth dayInYear
		 */
		
		Date now = new Date();
		
		String pattern1 = "yyyy-mm-dd";
		String pattern2 = "yyyy-M-d";
		String pattern3 = "yyyy년 M월 d일";
		String pattern4 = "yyyy년 M월 d일 EEEE";
		String pattern5 = "HH:mm:ss";
		String pattern6 = "hh:mm:ss";
		String pattern7 = "a h시 m분 s초";
		
		SimpleDateFormat formatter = new SimpleDateFormat(pattern7);
		String text = formatter.format(now);
		System.out.println(text);
	}
}
