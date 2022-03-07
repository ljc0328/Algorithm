package SWexpertD1;

import java.util.Scanner;

public class SW2068최대수구하기 {
	 static Scanner sc = new Scanner(System.in);
	    public static void main(String args[]) {
	      
	        int T = sc.nextInt();
	         
	        for(int tc=1; tc<=T; tc++) {
	            int max = 0;
	            for(int i=0; i<10; i++) {
	                int n = sc.nextInt();
	                if( n > max ) max = n;
	            }
	            System.out.format("#%d %d\n", tc, max);
	        }
	    }
	}
