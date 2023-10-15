package sec02.exam11;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		//예제에 추가로 조건문을 더 추가함 (C,D 등급 추가)
		int score = 70;
		char grade = (score>=90)?('A'):((score>=80)?('B'):((score>=70)?('c'):('d')));
		System.out.println(grade);
	}
}
