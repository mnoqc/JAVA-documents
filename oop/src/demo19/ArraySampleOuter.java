package demo19;

public class ArraySampleOuter {
	
	private String[] data = new String[10];
	// 다음번에 저장될 위치를 나타내는 변수다.
	// 값이 저장될 때마다 1씩 증가된다.
	private int position = 0;
	
	public void add(String value) {
		data[position] = value;
		position++;
	}
	
	public InnerIterator iterator() {
		ArrayIterator iter = new ArrayIterator();
		return iter;
	}

	// InnerIterator 인터페이스를 구현한 멤버 내부 클래스다.
	// ArraySampleOuter가 배열을 이용해서 저장하고 있는 값을
	// 처음부터 끝까지 반복처리할 수 있는 기능을 제공한다.
	private class ArrayIterator implements InnerIterator {
		// ArrayIterator에서 값을 꺼낼 위치를 나타내는 변수
		// 값을 하나 꺼낼 때마다 1씩 증가된다.
		private int currentPosition = 0;
		
		// 다음번에 꺼낼 값이 존재하는지 알려주는 의미이다.
		// 
		@Override
		public boolean hasNext() {
			/*
			 * currentPosition
			 * |
			 * [홍길동][김유신][null][null][null][null][null]
			 * 					|
			 * 				position
			 * currentPosition 위치가 position 위치보다 작을 때만
			 * true를 반환한다. (값을 꺼낼 수 있다.)
			 */
			if (currentPosition < position) {
				return true;
			} else {
			return false;
		}
	}
		// currentPosition이 가리키는 위치에서 값을 꺼내서 반환한다.
		// 값을 하나씩 꺼낼 때마다 currentPosition 값을 1씩 증가시킨다.
		@Override
		public String next() {
			String value = data[currentPosition];
			currentPosition++;
			
			return value;
		}
	}
}
