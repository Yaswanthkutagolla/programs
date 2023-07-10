package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] deci=new int[30];
		int index=0;
		while(n>0) {
			int r=n%2;
			n=n/2;
			deci[index++]=r;
		}
		System.out.println();
		for(int i=index-1;i>=0;i--)
		System.out.print(deci[i]);
		
	}
}

