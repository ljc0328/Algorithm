package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_2588_곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();//자연수를 charAt로 한자리씩 못 받아오는
		
		//3 - 2(1)*1
		int Three = A*(B.charAt(2)-'0');	
		System.out.println(Three);
		//4 - 2(2)*1
		int four = A*(B.charAt(1)-'0');
		System.out.println(four);
 		//5 - 2(3)*1
		int five = A*(B.charAt(0)-'0');
		System.out.println(five);
		//6 - A*B
		int six = A*(Integer.parseInt(B));		
		System.out.println(six);
			
		sc.close();
	}
}
