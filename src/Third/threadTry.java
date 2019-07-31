package Third;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i = 1;i <= 10;i++) {
			System.out.println(getName()+"正在打印"+i);
		}
	}
}
public class threadTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m = new MyThread("打印机");
		m.start();
	}

}
