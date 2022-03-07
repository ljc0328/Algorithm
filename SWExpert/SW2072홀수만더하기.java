package SWexpertD1;

import java.util.Scanner;

public class SW2072홀수만더하기 {
	  static Scanner sc = new Scanner(System.in);
	  
	    public static void main(String args[]) {
	        int T = sc.nextInt();
	        for( int tc=1; tc<=T; tc++ ) {
	            int sum = 0;
	            for( int j=0; j<10; j++ ) {
	                int n = sc.nextInt();
	                if( n%2 == 1 ) sum+=n;
	            }
	            System.out.format("#%d %d\n", tc, sum);
	        }
	    }
}