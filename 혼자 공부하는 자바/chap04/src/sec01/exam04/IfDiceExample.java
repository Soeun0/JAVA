package sec01.exam04;

public class IfDiceExample {
	public static void main (String[] args) {
		//주사위 만들기 (1~6중 무작위 수 뽑기)
		int num = (int)(Math.random()*6)+1;
		
		if (num==1) {
			System.out.println("주사위는 1이다.");
		}
		if (num==2) {
			System.out.println("주사위는 2이다.");
		}
		if (num==3) {
			System.out.println("주사위는 3이다.");
		}
		if (num==4) {
			System.out.println("주사위는 4이다.");
		}
		if (num==5) {
			System.out.println("주사위는 5이다.");
		}
		if (num==6) {
			System.out.println("주사위는 6이다.");
		}
	}
}
