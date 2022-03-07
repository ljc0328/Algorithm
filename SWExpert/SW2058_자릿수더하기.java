package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW2058_자릿수더하기 {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream(""));
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String S = Integer.toString(N);
		int sum = 0;
		
		for (int i = 0; i < S.length(); i++) {
			sum = sum + S.charAt(i)-'0';
		}
		System.out.println(sum);
		
		sc.close();
	}
}
