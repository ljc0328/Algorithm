package BAEJOON_top100;

import java.util.*;
import java.io.*;
import java.sql.Array;

public class b2_1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] score = new double[N];
		
		for (int i = 0; i < score.length; i++) {
			score[i]=sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(score);
		
		for (int i = 0; i < score.length; i++) {
			sum = sum+((score[i]/score[score.length-1])*100);
		}
		System.out.println(sum / score.length);
	}
}
