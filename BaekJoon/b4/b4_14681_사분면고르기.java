package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_14681_사분면고르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) { System.out.println("1"); }
		if(x<0 && y>0) { System.out.println("2"); }
		if(x<0 && y<0) { System.out.println("3"); }
		if(x>0 && y<0) { System.out.println("4"); }
	}
}
