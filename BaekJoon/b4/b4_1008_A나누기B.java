package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b4_1008_A나누기B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double result = A/B;
		
		String st = String.format("%.2f", result);
		
		System.out.println(st);
		
	}
}
