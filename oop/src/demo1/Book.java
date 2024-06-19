package demo1;

/*
 * Book 클래스는 도서 정보를 표현하는 객체를 생성하기 위한 설계도다. 
 * Book 클래스는 도서 정보 표현에 필요한 값을 저장하는 필드가 있다. 
 */

/** 자바 도큐먼트 주석:
 * Book 클래스는 도서 정보를 표현하는 객체를 생성할 때 사용하는 설계도다.
 */
public class Book {
	
		/*
		 * 필드
		 * - 객체의 정보를 저장한다. 
		 */
	
		String title;
		String author;
		String publisher;
		int price;
		double discountable;
		boolean soldout;

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
					+ ", discountable=" + discountable + ", soldout=" + soldout + "]";
		}

}
