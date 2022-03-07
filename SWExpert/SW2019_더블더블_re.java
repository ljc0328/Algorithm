package SWexpertD1;

import java.util.*;
import java.io.*;

//출력부분 연습 (틀림)
public class SW2019_더블더블_re {
	public static void main(String[] args) throws Exception	{
		//System.setIn(new FileInputStream(""));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // T값 받아오기
		
		for (int tc = 0; tc <= T; tc++) {
			System.out.format("%d", (int)Math.pow(2, tc));
		}
		
		sc.close();
	}
}
