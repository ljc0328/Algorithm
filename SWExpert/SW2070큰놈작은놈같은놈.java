package SWexpertD1;

import java.util.Scanner;

public class SW2070큰놈작은놈같은놈 {
	  static Scanner sc = new Scanner(System.in);
      public static void main(String args[]) {
       
          int T = sc.nextInt();
       
          for(int tc=1; tc<=T; tc++) {
              int a = sc.nextInt();
              int b = sc.nextInt();
              char res = '=';
           
              if( a > b ) res = '>';
              else if( a < b ) res = '<';
          System.out.format("#%d %c\n", tc, res);
      }
  }
}
