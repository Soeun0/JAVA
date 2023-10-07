package sec02.exam06;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 3 + 3.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "jDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDk";
		System.out.println(str3);
		System.out.println(str4);
		
		//예제 외에 실슴
		String str5 = "JDK";
		//출력문 안에서도 산술이 되는가?
		System.out.println(3 + 3.0 + str5);
		// 산술이 된다
		System.out.println(str5 + 3 + 3.0);
	}
}
