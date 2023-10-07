package sec02.exam09;
	
public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자군요.");
		}
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군요.");
		}
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9숫자이군요.");
		}
		
		// '!(charCode<48)'은 'charCode>=48'이랑 같은가?
		// 맞다.
		
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}
	}
}
