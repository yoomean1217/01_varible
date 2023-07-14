package edu.kh.varible.practice;

public class CastingPractice1 {
public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( (int) (iNum1 / iNum2) ); // 2
		// '/' 나누기한 몫
		// '%' 나머지
		System.out.println( (int) dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double) iNum1 ); // 10.0
		
		System.out.println( (double) iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int) fNum ); // 3
		System.out.println( (int) (iNum1 / fNum) ); // 3
		// inum1 / (int) fNum 도 가능
		
		
		// float / double 차이점
		System.out.println( iNum1 / fNum ); // 3.33333333
		System.out.println( iNum1 / ( (double) fNum) ); // 3.33333333333335
		
		// float : 소수점 아래 8번째 자리까지 연산 후 반올림
		// double : 소수점 아래 16번째 자리까지 연산 후 반올림
		
		// ** double 은 뒤가 5로 끝나는 이유?
		// -> 컴퓨터는 숫자를 2진수로 표현한다
		// -> 3.33.. 이런 실수도 2진수 11.0111011... 이런식으로
		// 2진수로 실수를 표현하면 무한히 반복되는 경우가 많다.
		// 따라서 일정한 크기만큼 계산하고 적당한 위치에서 잘라내어 반올림하는데
		// 2진수 -> 10진수로 변환했을때
		// float 7-8까지 자르고, double은 15-16자리까지 자름
		// 자르는 위치가 다르니 까 숫자가 다르게 나올 수 있다.
		// -> 2진수로 소수점 이하를 정확하게 표현하지 못하는 경우가 많아서
		// 근사치가 출력되게 된다. 2진수 -> 10진수 변환이 잘못된 경우
		
		
		System.out.println( "'" + ch + "'" ); //'A'
		System.out.println( (int) ch ); // 65
		System.out.println( (int) ch + iNum1 ); // 75
		System.out.println( "'" + (char) ( (int) ch + iNum1) + "'" ); //'K'
		// ch 와 iNum1 더하기 -> int 로 자동형변환
		// 그 값을 char 형태로 강제형변환
		// 양옆에 + 로 문자열 연결해주기
		
	}
}
