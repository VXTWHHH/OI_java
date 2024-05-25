package Knapsack03_opt;

import java.util.Scanner;

public class Main {
	//分组背包问题
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),V = sc.nextInt();
		int[][] w = new int[N+1][101],v = new int[N+1][101];
		int[] f = new int[101];
		int[] s = new int[N+1];
		//处理数据
		for(int i = 1;i<=N;i++) {
			s[i] = sc.nextInt();
			for(int j = 1;j<=s[i];j++) {
				v[i][j] = sc.nextInt();w[i][j] = sc.nextInt();
			}
		}
		//dp
		for(int i = 1;i<=N;i++) {
			for(int j = V;j>=1;j--) {
				for(int k = 1;k<=s[i];k++) {
					if(j>=v[i][k])f[j] = Math.max(f[j], f[j-v[i][k]]+w[i][k]);
				}
			}
		}
		System.out.println(f[V]);
		sc.close();
	}
}
