package edu.kh.variable.practice;

public class PrintExample {

	public static void main(String[] args) {
		// System.out.print() : 단순 출력(출력 후 줄바꿈 x)
		// System.out.println() : 한 줄 출력(출력 후 줄바꿈 수행)
		// 줄바꿈이라는 차이점은 있지만 괄호안의 내용이 그대로 나온다는것은 똑같다
		
		
		
		System.out.println("테스트1");
		System.out.println("테스트1");
       
		System.out.print("테스트3");
		System.out.println("테스트3");
		
		
		// System.out.printf() :
		
		System.out.println(); // 위에 print 구문썻으니 줄바꿈 해줌
		
		int iNum1 = 10;
		int iNum2= 5;
		
		// 10 + 5 = 15
		
		System.out.println(iNum1 + " + " + iNum2 + " = " +(iNum1 + iNum2));
		
		
		
		/*
		 *  printf
		 *  %d : 정수형, %o : 8진수, %x : 16진수
		 *  %c : 문자, %s : 문자열
		 *  %f : 실수 (소수점 아래 6자리), %e : 지수형태표현, %g : 대입값그대로
		 *  %A : 16진수 실수
		 *  %b : 논리형
		 *  
		 *   */
		
	
		
	     // 패턴 연습
		
		int iNum3 = 3;
		System.out.printf("%d\n" ,iNum3);
		System.out.printf("%5d\n" ,iNum3);
		System.out.printf("%-5d\n" ,iNum3);
		 
		
		//소수점 자리 제어
		System.out.printf("%f\n", 10 / 4.0); // 2.500000
		System.out.printf("%.2f\n", 10 / 4.0); // 소수점 둘째자리까지만 나타내고 싶다
		System.out.printf("%.0f\n", 10 / 4.0); // 소수점 아래를 표현하지 않겠다
		 
		
		//문자, 문자열, boolean
		boolean isTure = false ;
		char ch = '조' ;
		String str = "안녕하세요" ; // String은 참조형(기본자료형을 뺸 나머지)
		
		System.out.printf("%b / %c / %s\n", isTure, ch, str);
		
		
		//escape(이스케이프 == 탈출) 문자 : 일반 문자가 아닌 특수문자 표현
		
		// 
		
		System.out.println("\\"); // 백슬래시(역슬래시) 출력 방법
		
		System.out.println("\\o/");
		
		System.out.println("a\td\tc\td");  // tab 출력
		
		
		//한공간씩 표현x , 한번에 공간차지
		
		//유니코드 이스케이프
		System.out.println("\u0041");  //유니코드(16진수) 65를 16진수로 표현 
		                               // 65 나누기 16하면 몫 4고, 나머지1
		
		
		
		
	}

}
