package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW1936_1대1가위바위보_re {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream(""));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //A가 낸 것
		int b = sc.nextInt(); //B가 낸 것
		
		if((a==1&&b==2) || (a==2&&b==3) || (a==3&&b==1)){
			System.out.println("B");
		}else
			System.out.println("A");
		sc.close();
	}
}
