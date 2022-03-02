package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b3_10818_최소최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[N-1]);
	}
}

//public static void main(String[] args) throws IOException {
//	Scanner scan = new Scanner(System.in);
//    int cnt = scan.nextInt();
//    int min = Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//	
//    for (int i=0; i<cnt; i++) {
//        int num = scan.nextInt();
//        if (min > num) min = num;
//        if (max < num) max = num;
//    }
//    
//    System.out.print(min + " " + max);
//}
//}