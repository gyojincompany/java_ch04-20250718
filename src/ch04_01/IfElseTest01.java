package ch04_01;

public class IfElseTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 점수가 90점 이상이면 수, 80점 이상 90점 미만이면 우, 70점 이상 80점 미만이면 미, 
		// 60점 이상이면 70점 미만이면 양, 60점 미만이면 가를 출력하는 프로그램
		int score = 55;
		
		if(score >= 90) {
			System.out.println("수");
		} else if(score >= 80) {
			System.out.println("우");
		} else if(score >= 70) {
			System.out.println("미");
		} else if(score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}	
			
		System.out.println("축하합니다!");
		
		// value 값이 10이상 20미만이면 통과를 출력하시오. value >= 10 value < 20
		// 10 <= value < 20 -> X
		int value = 15;
		
		if(value >= 10 && value < 20) {
			System.out.println("통과");
		}
		
	}

}
