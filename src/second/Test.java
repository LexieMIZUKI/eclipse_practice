package second;

public class Test{
    // ���Է���
	public static void main(String[] args) {
     //ʵ�������󣬵�����ط���ʵ������Ч��
     User one = new User("Lucy","123456");
     User two = new User("Mike","123456");
     UserManager us = new UserManager();
     us.checkUser(one,two);
	}
}