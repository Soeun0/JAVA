package Guess;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
	
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random()*10);
		System.out.println("0 이상 9 이하의 숫자를 맞춰보세요.");
		
		while(true) {
			System.out.println("1번째 숫자를 입력해주십사오: ");
			p1.guess();
			guessp1=p1.number;
			System.out.println("2번째 숫자를 입력해주십사오: ");
			p2.guess();
			guessp2=p2.number;
			System.out.println("3번째 숫자를 입력해주십사오: ");
			p3.guess();	
			guessp3=p3.number;
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			
			if (p1isRight||p2isRight||p3isRight) {
				System.out.println("맞춘사람이 있습니다.");
				System.out.println("정답은 " + targetNumber + "입니다.");
				System.out.println("게임이 끝났습니다.");
				break;
			}
			else {
				System.out.println("다시 시도해야 합니다.");
				System.out.println("정답은 " + targetNumber + "입니다.");
			}
		}
	}
	
	
	
	
}
