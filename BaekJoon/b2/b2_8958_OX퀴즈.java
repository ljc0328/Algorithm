package BAEJOON_top100;

import java.util.*;
import java.io.*;

public class b2_8958_OX퀴즈 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] str = new String[sc.nextInt()];
			
			for(int i = 0; i < str.length; i++) {
				str[i] = sc.next();
			}
			sc.close();

			for(int i = 0; i<str.length; i++) {
				int cnt = 0;
				int sum = 0;
				
				for(int j = 0; j<str[i].length(); j++) {
					
					if(str[i].charAt(j) == 'O') {
						cnt++;
					} else {
						cnt = 0;
					}
					sum += cnt;
				}
				
				System.out.println(sum);
			
			}
		}
	}