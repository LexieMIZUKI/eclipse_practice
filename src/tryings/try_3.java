package tryings;

import java.util.Scanner;

public class try_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try_3 t = new try_3();
		try {
			int x = s.nextInt();
			if(x <= 0)
				throw new ex(x);
			else
				System.out.println(Math.sqrt(x));
		}catch(ex e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}

