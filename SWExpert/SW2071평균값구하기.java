package SWexpertD1;

import java.util.Scanner;

public class SW2071평균값구하기 {
	   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int T = sc.nextInt();    
        
           for(int i=0; i<T; i++) {
               float sum = 0;
           for(int j=0; j<10; j++) {  
               int num = sc.nextInt();
               sum += num;
           }
           System.out.println("#" + (i+1)+ " " + Math.round(sum/10));
       }
   }
}