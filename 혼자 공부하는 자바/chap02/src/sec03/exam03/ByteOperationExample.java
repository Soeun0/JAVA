package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1); //이경우는 바이트 변수가 피연산자가 아니기 때문에 타입변환X
		
		byte a = 1;
		byte b = 2;
		int result2 = a+b;
		System.out.println(result2);
	}
}
