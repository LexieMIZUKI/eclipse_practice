package First;

import java.util.Arrays;
import java.util.Scanner;

public class shuzu {
	public int[] insertData() {
		int[] a= new int[9];
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < a.length;i++){
			System.out.println("�������"+(i+1)+"�����ݣ�");
			a[i]=scan.nextInt();
		}
		return a;
	}
	public void showData(int[] a,int length) {
		System.out.println("����Ԫ��Ϊ��");
		for(int i=0;i<length;i++){
			System.out.print(a[i]+"  ");
			}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shuzu one = new shuzu();
		int[] result= one.insertData();
		System.out.println("����Ԫ��Ϊ��");
		for(int a:result)
			System.out.print(a+"  ");
		System.out.println();
		one.showData(result, 9);
	}

}
