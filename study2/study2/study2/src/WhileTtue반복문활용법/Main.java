package WhileTtue반복문활용법;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			if( x < 0 ) {break;}
			System.out.println(x);
			}
		sc.close();
		}
	}

