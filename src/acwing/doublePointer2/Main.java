package doublePointer2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt(),x = sc.nextInt();
		int[] a = new int[n],b = new int[m];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		for(int i = 0;i<m;i++)b[i] = sc.nextInt();
		for(int i = 0,j = m-1;i<n&&j<m;i++) {
			while(j>0&&a[i]+b[j]>x)j--;
			if(a[i]+b[j]==x)System.out.println(i+" "+j);
		}
		sc.close();
	}
}
