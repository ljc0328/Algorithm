package SWexpertD1;

import java.util.*;
import java.io.*;

public class SW2027_대각선출력하기 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
}
