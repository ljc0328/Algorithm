package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW1933_간단한N의약수 {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream(""));
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if(N%i == 0)
				System.out.print(i+" ");
			
		}
		sc.close();
	}
}
