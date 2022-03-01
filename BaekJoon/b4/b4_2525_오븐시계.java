package BAEJOON_top100;

import java.util.*;

public class b4_2525_오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int add = sc.nextInt();
		
		int time = B+add;
		//시간이 주어지고 추가 분이 주어졌을 때 합 계산
		//60분이 넘어가면 시간에 +1, 분은 초기화
		while(time>=60) {
			time-=60;
			A++;
		}
		//23시 59분이 넘어가면 시간 00으로 초기화
		while(A>23) {
			A-=24;
		}
		System.out.printf("%d %d", A, time);
	}
}
