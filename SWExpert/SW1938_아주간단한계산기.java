package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW1938_아주간단한계산기 {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream(""));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
		sc.close();
	}
}
