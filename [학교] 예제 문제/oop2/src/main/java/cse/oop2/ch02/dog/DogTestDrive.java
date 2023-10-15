package cse.oop2.ch02.dog;
import java.util.Scanner;
public class DogTestDrive { // Dog를 실행 시켜보기 위한 클래스
    public static void main (String[] args) {
        Dog d = new Dog(); //Dog 객체를 만들어준다.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("이름을 입력하세요: ");
        d.name = sc.next(); //name(문자열) 입력받기
        
        System.out.println("견종을 입력하세요: ");
        d.breed = sc.next(); //breed(문자열) 입력받기
        
        System.out.println("사이즈를 입력하세요: ");
        d.size = sc.nextInt(); //size(정수) 입력받기
        
        d.bark(); // 메소드를 호출한다.
    }
}
