package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW1541_거꾸로출력해보아요_ok{
	public static void main(String[] args) throws Exception	{
		//System.setIn(new FileInputStream(""));
		Scanner sc  = new Scanner(System.in);
		
		int N = sc.nextInt(); //입력된 숫자 N 받아오기
		
		for (int i = N; i >=0; i--) { //N까지반복
			System.out.print(i);
		}
	}
}
