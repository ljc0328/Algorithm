package BaekJoon;

import java.util.*;

public class BJ_G4_16938_캠프준비 {

	static int N, L, R, X, Ans;
	static int[] Level;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();//문제 수
		L = scanner.nextInt();//합(최소)
		R = scanner.nextInt();//합(최대)
		X = scanner.nextInt();//차이

		Level = new int[N]; //문제 난이도
		check = new boolean[N];

		Ans = 0;
		for (int i = 0; i < N; i++) {
			Level[i] = scanner.nextInt();
		}
		
		powerSet(0);
		System.out.println(Ans);
	}

	private static void powerSet(int cnt) { //부분집합
		if (cnt >= N) {
			int coicecnt = 0;// 선택된 문제수
			for (boolean b : check) {
				if (b)
					coicecnt++;
			}
			
			// 2개 이상일 때만 선택하려고
			if (coicecnt < 2)
				return;

			int[] question = new int[coicecnt];
			int idx = 0;
			int sum = 0;// 문제 난이도 합
			// 문제 난이도 합 후에 정렬
			for (int i = 0; i < N; i++) {
				if (check[i]) {
					question[idx++] = Level[i];
					sum += Level[i];
				}
			}
			
			// 정렬된거에서 최소, 최대 
			Arrays.sort(question);
			// 최대난이도에서 최소난이도 차이
			int sub = question[coicecnt - 1] - question[0];
			if (sum >= L && sum <= R && sub >= X) {
				Ans++;
			}
			return;
		}

		// 부분 집합
		check[cnt] = true;
		powerSet(cnt + 1);

		check[cnt] = false;
		powerSet(cnt + 1);
	}
}
