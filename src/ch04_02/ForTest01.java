package ch04_02;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요!!");
		System.out.println("안녕하세요!!");
		System.out.println("안녕하세요!!");
		System.out.println("안녕하세요!!");
		System.out.println("안녕하세요!!");
		System.out.println("===============================");
		
		int a = 0; // 초기화식
		
		for(int i=0;i<5;i++) { // for(초;조;증)
			System.out.println("안녕하세요!!");
			System.out.println("i값 : " + i);
		}
		System.out.println("===============================");

		//0~100사이의 짝수만 출력하시오.
		for(int i=0;i<=100;i=i+2) {
			System.out.println("i값 : " + i);
		}
		
		System.out.println("===============================");
		
		//1~100사이의 홀수만 출력하시오.
		for(int i=1;i<=100;i=i+2) {
			System.out.println("i값 : " + i);
		}
		
		int total = 0;
		int kor = 95;
		int eng = 80;
		int math = 70;
//		total = kor + eng + math; // total=245
		total = total + kor; // total=95
		total = total + eng; // total=175
		total = total + math; // total=245
		
		System.out.println("===============================");
		
		int sum = 0;
		//1~100까지 모든 수의 합을 구하시오.
//		int sum = 1+2+3+4.+5..+100
		for(int i=1;i<=100;i++) {
			sum = sum + i; // 누적식
//			System.out.println("sum값 :" + sum);
		}
		System.out.println("sum값 :" + sum);
		
		System.out.println("===============================");
		
		//1~100사이의 짝수만 출력하시오.
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.println("i값 : " + i);
			}
		}
		//1~100사이의 홀수만 출력하시오.
		for(int i=1;i<=100;i++) {
			if(i % 2 != 0) {
				System.out.println("i값 : " + i);
			}
		}
		
		
	}

}
