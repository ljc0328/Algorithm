package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b2_2562_최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max= arr[0];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				count=i;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
	}
}