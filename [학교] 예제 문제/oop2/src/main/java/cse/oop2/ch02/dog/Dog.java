package cse.oop2.ch02.dog;
public class Dog {
    int size; //정수형 'size' 변수 선언
    String breed; // 문자열 'breed'변수 선언
    String name; // 문자열 'name' 변수 선언

    void bark() {
        System.out.println("<<<< 결과 >>>>");
        System.out.println("RUFF! RUFF!");
        //'bark'메소드를 생성 -> 'RUFF! RUFF!'가 출력될수있도록 함
        System.out.println("이름은 " + name + "입니다."); //name 출력
        System.out.println("견종은 " + breed + "입니다."); //breed 출력
        System.out.println("사이즈는 " + size + "입니다."); //size 출력
    }
}
