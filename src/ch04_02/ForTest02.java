package ch04_02;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=0;i--) {
			System.out.println("i값 : " + i);			
		}
		System.out.println("===============================");
		
		for(int i=5;i<=10;i--) {			
			if(i == -1) {
				break; // for문 while문 같은 반복문을 강제종료
			}
			System.out.println("i값 : " + i);
		}
		
		System.out.println("===============================");
		
	}

}
