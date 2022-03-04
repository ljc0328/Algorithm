package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b2_2577_숫자의개수 {
	public static void main(String[] args) {
		//System.setIn(new FileInputStream(""));
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int Pro = A*B*C;
		int[] count = new int[10];
		while(Pro>0) {
			count[Pro%10]++;
			Pro = Pro/10;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		System.out.println();
	}
}

/*
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int Value = A*B*C;
		String str = Integer.toString(Value);
		int count=0;
		for(i=0; i<10; i++){
			for(int j =0; j<str.length(); j++){
				if(str.charAt(j)-'0'==1)
				count++;
			}
			sysout(count);
			count=0;
			}
		}
	}
*/