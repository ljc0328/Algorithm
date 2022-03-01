package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_2753_윤년 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		
		if(Y%4==0) {
			if(Y%400==0) System.out.println("1");
			else if(Y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}
}
