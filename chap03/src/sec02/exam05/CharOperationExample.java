package sec02.exam05;

public class CharOperationExample {
	public static void main (String[] args) {
		char c1 = 'A' +1;
		char c2 = 'A';
		//char c3 = c2 + 1; char로 하면 오류남. 산술연산의 결과는 int이상의 타입으로 해야함
		int c3 = c2 + 1;
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}
