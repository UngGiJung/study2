package p8조건문;

public class p8조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 84;
		
		if (score >= 90) {
			System.out.print("A");
			if (score >= 95 ) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		} else {
			System.out.print("B");
			if (score >= 85) {
				System.out.print("+");
		} else {
			System.out.print("-");
		}

	}
	}

}
