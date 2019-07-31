package Third;
class Letter implements Runnable{
	char[] le = new char[26];
	public Letter() {
		int j = 97;
		for(int i = 0;i < 26;i++) {
			le[i] = (char)j;
			j++;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < le.length;i++) {
			System.out.print(le[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class lletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter l = new Letter();
		Thread t = new Thread(l);
		t.start();
	}

}
