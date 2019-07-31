package First;

import java.util.Scanner;

public class give {
	String one = "aaaa";
	String two = "bbbb";
	int[] change = new int[10];
	public void insertAtArray(int[] a,int n,int k) {
		Scanner scan2 = new Scanner(System.in);
		change = new int[a.length];
		System.out.print("请输入插入的数据:");
		n = scan2.nextInt();
		System.out.print("请输入要插入的位置:");
		k = scan2.nextInt();
		for(int i = 0;i < k;i++) {
			change[i] = a[i];
		}
		change[k-1] = n;
		for(int i = k-1;i < a.length-1;i++) {
			change[i+1] = a[i];
		}
		for(int c:change)
			System.out.print(c+"  ");
		System.out.println();
	}
	public void divThree(int[] a) {
		a = this.change;
		for(int i = 0;i < a.length;i++) {
			if(a[i] % 3 == 0) {
				System.out.print(a[i]+"  ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = {1,2,3,4,5,6,7,8,9,0};
		int n = 0;
		int k = 0;
		give one = new give();
		one.insertAtArray(result, n, k);
		one.divThree(result);
	}

}
