package p46배열타입;

public class 배열타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//한정	int[] scores = {83,90,87,79};
		int[] scores = {83,90,87,79,95,81};

		//반복문 사용 풀이
		
		//고객사의 요청으로 유지보수시 한정적인 코딩
//		for (int i = 0; i < 4; i++) {
//			System.out.println("scores[" + i + "] : " + scores[i]);
//		}
		//고객사의 요청으로 유지보수시 무한정 코딩
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
		
		
		//일반적 풀이
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		System.out.println("scores[3] : " + scores[3]);
		
		int sum = 0;
		
		//유지보수시 한정적인 코딩
//		for (int i = 0; i < 4; i++) {
//			sum +=scores[i];
//		}
		
		//고객사의 요청으로 유지보수시 무한정 코딩
		for (int i = 0; i < scores.length; i++) {
			sum +=scores[i];
		}
		
		
		System.out.println("sum : " + sum);
		double avg = (double) sum / 4;
		System.out.println("avg : "+avg);
		System.out.printf("avg : %.1f",avg);
		
		
		
	}

}
