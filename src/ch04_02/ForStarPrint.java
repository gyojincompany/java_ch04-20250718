package ch04_02;

public class ForStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*****
//		*****
//		*****
//		*****
		
//		for(int j=1;j<=5;j++) {
//			System.out.print("*");
//		}
//		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		*
//		**
//		***
//		****
		for(int i=1;i<=4;i++) {
			System.out.println(i+1);
		}
		
		
		for(int i=1;i<=4;i++) {
//			for(int j=1;j<i+1;j++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		****
//		***
//		**
//		*
		
		for(int i=4;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
