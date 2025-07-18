package ch04_02;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중첩 for문 연습
		for(int i=1;i<=4;i++) { //4번 반복
			System.out.println("안녕하세요!");
			for(int j=1;j<=5;j++) { //5번 반복
				System.out.println("반갑습니다!");				
			}
		}
		
		for(int i=1;i<=4;i++) { //4번 반복
			System.out.println("안녕하세요!");
			for(int j=1;j<=5;j++) { //5번 반복
				System.out.println("반갑습니다!");		
					for(int k=1;k<=3;k++) { //3번 반복
						System.out.println("감사합니다!");
					}
			}
		}
		
		System.out.println(); //줄을 바꿔줌
		
	}

}
