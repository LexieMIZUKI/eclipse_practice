package second;
public class User{
    //定义属性用户名、密码
    private String name;
    private String password;
    public User(String name,String password){
        this.name = name;
        this.password = password;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}