package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW2050_알파벳을숫자로변환 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			String str = sc.next();
			
			
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i)-64);
				
				
			
			}
		}
	}
}
