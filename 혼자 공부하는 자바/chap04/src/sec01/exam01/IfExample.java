package sec01.exam01;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급이 A입니다.");
		}
		
		if(score<90)
			System.out.println("점수가 90보다 적습니다.");
			System.out.println("등급은 B입니다.");//if문과는 상관없는 실행문
			//그러나 이는 햇갈릴 수 있으므로 한줄이라도 괄호를 써주는 것이 좋다.
	}
}
