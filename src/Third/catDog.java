package Third;

class Cat implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 3;i++) {
			System.out.println(Thread.currentThread().getName()+"A Cat");
		}
	}
	
}

class Dog implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 3;i++) {
			System.out.println(Thread.currentThread().getName()+"A Dog");
		}
	}
	
}
public class catDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 3;i++) {
			System.out.println("MainThread");
		}
		Cat c = new Cat();
		Dog d = new Dog();
		Thread t1 = new Thread(c); 
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}

}
