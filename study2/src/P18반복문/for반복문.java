package P18반복문;

public class for반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {9, 7, 8, 9, 8};
		
		int sum = 0;
		for(int s : scores) {
			sum += s;
		}
		
		System.out.println("sum : " + sum);
		
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			//length : 숫자가 배열된 칸수 => 9, 7, 8, 9, 8 총 5개
			sum2 += scores[i];
		}
		System.out.println("sum2 : " + sum2);
	}

}
