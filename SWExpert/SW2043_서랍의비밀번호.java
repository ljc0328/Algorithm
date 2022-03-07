package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW2043_서랍의비밀번호 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(P-K+1);
		
		sc.close();
	}
}
