package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b3_11022_A더하기B8 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc < T; tc++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] result = new int[T];
		result[tc] = a+b;
			
		System.out.println("Case #"+tc+":"+" "+a+"+"+b+"="+result[tc]);
		}
		sc.close();
	}
}
