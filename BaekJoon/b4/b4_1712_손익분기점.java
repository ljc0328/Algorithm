package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_1712_손익분기점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = A/(C-B)+1;//총 개수

		if(C<=B) {
			System.out.println("-1");
		}
		else {
			System.out.println(N);
		}
		sc.close();
	}
}
