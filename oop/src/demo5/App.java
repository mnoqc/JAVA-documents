package demo5;

import utils.Keyboard;

public class App {
	
	public static void main(String[] args) {
		
		// 키보드로 입력한 값을 읽어오기
		
		// 문자열 읽어오기
		System.out.println("이름을 입력하세요.");
		String name = Keyboard.readString();
		System.out.println("입력값: " + name);
		
		// 정수 읽어오기
		System.out.println("출생년도를 입력하세요.");
		int birthYear = Keyboard.readInt();
		int age = 2024 - birthYear;
		System.out.println("나이: " + age);
		
		System.out.println("키를 입력하세요(m).");
		double height = Keyboard.readDouble();
		System.out.println("몸무게를 입력하세요(kg).");
		double weight = Keyboard.readDouble();
		
		double bmi = height/Math.pow(height,  2);
		System.out.println("체질량지수: " + bmi);
		
		if (bmi <= 18.5) {
			System.out.println("저체중");
		} else if (bmi <= 23) {
			System.out.println("정상");
		} else if (bmi <= 25) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
	}

}
