package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b3_2884_알람시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M < 45) {
			H--;		
			M= 60 - (45 - M); 	
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
