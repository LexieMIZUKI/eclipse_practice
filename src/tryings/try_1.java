package tryings;

public class try_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateString  = "2002/02/20";
		String tmp = " ";
		boolean flag = true;
		int index1 = dateString.indexOf("/");
		if(dateString.length() == 10) {
			if(index1 == 4) {
				tmp = dateString.substring(5);
				int index2 = tmp.indexOf("/");
				if(index2 == 6)
					flag = true;
			}
		} else 
			flag = false;
		System.out.println(flag);
	}

}
