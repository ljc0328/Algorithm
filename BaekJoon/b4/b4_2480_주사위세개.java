package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_2480_주사위세개 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//3개가 같을 때
		if(a==b && b==c && c==a) {
			System.out.println(10000 + a*1000);
		}
		//2개가 같을 때
		else if(a==b || b==c) {
			System.out.println(1000 + b*100);
		}else if(a==c) {
			System.out.println(1000 + a*100);
		}
		//모두 다를 때
		else System.out.println(Math.max(a, Math.max(b, c))*100);
	}
}
