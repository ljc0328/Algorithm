package SWexpert;

import java.util.*;
import java.io.*;

public class SW_7465_창용마을무리의개수 {

	static int[][] map;
    static boolean[] check;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            map = new int[N+1][N+1];
            int ans = 1;
            check = new boolean[N+1];
            for(int i=0; i<M; i++){
                int ni = sc.nextInt();
                int nj = sc.nextInt();
                map[ni][nj] = 1;
                map[nj][ni] = 1;
            }
            for(int i=1; i<N+1; i++){
                if(!check[i]){
                    dfs(i, N+1);
                    for(int j=1; j<N+1; j++) {
                        if(!check[j]) {
                            ans++;
                            break;
                        }
                    }
                }
            }
            System.out.println("#"+tc+" "+ans);
        }
        sc.close();
    }
 
    static void dfs(int n, int k) {
        if(!check[n]) {
        	check[n] = true;
           for(int i=1; i<k; i++){
               if(map[n][i]==1 && !check[i]) dfs(i, k);
           }
        }
    }
}

