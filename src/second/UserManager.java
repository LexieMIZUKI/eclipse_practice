package second;

public class UserManager{
    // �û���Ϣ��֤�ķ���
    public String checkUser(User one, User two) {
       // �ж��û����Ƿ�Ϊ�գ��Ƿ�һ��
       one = new User("Lucy","123456");
        two = new User("Mike","123456");
    
    System.out.println("�û�����"+one.getName());
    System.out.println("���룺"+one.getPassword());
    System.out.println("�û�����"+two.getName());
    System.out.println("���룺"+two.getPassword());
    System.out.println("===============================");
    
    if("".equals(one.getName())||"".equals(two.getName()))
        System.out.println("�û�������Ϊ�գ�");
        else if(!one.getName().equals(two.getName()))
        System.out.println("�û�����һ�£�");
        
    // �ж������Ƿ�Ϊ�գ��Ƿ�һ��
    if("".equals(one.getPassword())||"".equals(two.getPassword()))
        System.out.println("���벻��Ϊ�գ�");
        else if(!one.getPassword().equals(two.getPassword()))
        System.out.println("���벻һ�£�");
        // return one,two;
	return null;
    }
    
}