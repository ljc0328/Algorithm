package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_9498_시험성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		if(90<=S && S<=100) {
			System.out.println("A");
		}else if(80<=S && S<=89) {
			System.out.println("B");
		}else if(70<=S && S<=79) {
			System.out.println("C");
		}else if(60<=S && S<=69) {
			System.out.println("D");
		}else System.out.println("F");
		sc.close();
	}
}
