package First;

import java.util.Scanner;

public class changing {
	public void insertAtArray(int[] a,int n,int k) {
		Scanner scan2 = new Scanner(System.in);
		int[] change = new int[a.length+1];
		System.out.println("请输入插入的数据:");
		n = scan2.nextInt();
		System.out.println("请输入要插入的位置:");
		k = scan2.nextInt();
		for(int i = 0;i < k;i++) {
			change[i] = a[i];
		}
		change[k-1] = n;
		for(int i = k-1;i < a.length;i++) {
			change[i+1] = a[i];
		}
		for(int c:change)
			System.out.print(c+"  ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int k = 0;
		int[] result = {1,2,3,4,5,6,7,8,9};
		changing one = new changing();
		one.insertAtArray(result, n, k);
	}

}
