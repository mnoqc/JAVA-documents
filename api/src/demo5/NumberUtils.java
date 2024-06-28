package demo5;

/*
 * 문자열과 기본값을 전달받아서 문자열 정수로 변환해서 반환한다.
 * @param str 문자열
 * @param defaultValue 기본값
 * @return 문자열을 정수로 변환한 값. 문자열이 유효한 값이 아니면 기본값을 반환한다.
 */
public class NumberUtils {
	
	public static int toInt(String str, int defaultValue) {
		if (str == null) { // 무조건 null부터 먼저 체크
			return defaultValue;
		}
		if (str.isBlank()) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			return defaultValue;
		}	
	}
	
	/*
	 * 문자열을 전달받아서 양의 정수로 변환해서 반환한다.
	 * @param str 문자열
	 * @return 정수, 문자열이 유효한 값이 아니면 1을 반환한다. 
	 */
	public static int toPositiveInt(String str) {
		int value = NumberUtils.toInt(str, 1);
		return value > 0 ? value : 1;
		
	}
	
	/*
	 * 문자열을 전달받아서 정수로 변환해서 반환한다.
	 * @param str 문자열
	 * @return 문자열을 정수로 변환한 값, 문자열이 유효한 값이 아니면 0을 반환한다.
	 */
	
	public static int toInt(String str) {
		return NumberUtils.toInt(str, 0);
		
	}

}
