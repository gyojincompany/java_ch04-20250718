package ch04_02;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int score = 60;
//		
//		if(score > 70) {
//			System.out.print("통과!!");
//		}
		
		int i=0;
		
		while(i <= 5) {			
			System.out.println("통과!!");
			i++;//i=i+1
		}
		
		int kor = 80;
		
		while(kor >= 100) {
			System.out.println("코리아 파이팅!!!");
		}
		
		do {
			System.out.println("코리아 파이팅!!!");
			
		} while(kor >= 100);
		
		System.out.println("축하합니다!!");
	}

}
