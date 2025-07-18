package ch04_01;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = ((int) (Math.random()*6)) + 1; // 1,2,3,4,5,6 중에 랜덤으로 하나를 저장
		
//		String ch="kor";
//		
//		switch(ch) {
//			case "kor":
//		}
		
		switch(number) {
			case 1:
				System.out.println("일이 나왔습니다.");
				System.out.println("111111111111");
				break;
			case 2:
				System.out.println("이가 나왔습니다.");
				System.out.println("222222222222");
				break;
			case 3:
				System.out.println("삼이 나왔습니다.");
				System.out.println("3333333333333");
				break;
			case 4:
				System.out.println("사가 나왔습니다.");
				System.out.println("4444444444444");
				break;
			case 5:
				System.out.println("오가 나왔습니다.");
				System.out.println("5555555555555");
				break;
			case 6 :
				System.out.println("육이 나왔습니다.");
				System.out.println("6666666666666");
				break;
			default :
				System.out.println("주사위에서 나올 수 없는 숫자가 입력되었습니다.");
				
				
				
		}
	}

}
