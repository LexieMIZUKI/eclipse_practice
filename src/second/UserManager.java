package second;

public class UserManager{
    // 用户信息验证的方法
    public String checkUser(User one, User two) {
       // 判断用户名是否为空，是否一致
       one = new User("Lucy","123456");
        two = new User("Mike","123456");
    
    System.out.println("用户名："+one.getName());
    System.out.println("密码："+one.getPassword());
    System.out.println("用户名："+two.getName());
    System.out.println("密码："+two.getPassword());
    System.out.println("===============================");
    
    if("".equals(one.getName())||"".equals(two.getName()))
        System.out.println("用户名不能为空！");
        else if(!one.getName().equals(two.getName()))
        System.out.println("用户名不一致！");
        
    // 判断密码是否为空，是否一致
    if("".equals(one.getPassword())||"".equals(two.getPassword()))
        System.out.println("密码不能为空！");
        else if(!one.getPassword().equals(two.getPassword()))
        System.out.println("密码不一致！");
        // return one,two;
	return null;
    }
    
}