
package Newconnection;


public class User {
    int user_id;
    String name;
    String email;
    String phone;
    String password;
    
    
    public User(){
    
    }
    
    public User(int user_id, String name , String email, String phone, String password){
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        

    }
    public User(String name , String email, String phone, String password){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        
    }
    
    public User( String email,String password){
        this.email = email;
        this.password = password;
    }
    
    public void setId(int user_id){
        this.user_id = user_id;
    }
    public int getId(){
        return user_id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
     public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
     public void setPhone(String phone){
        this.phone = phone;
    }
     
    public String getPhone(){
        return phone;
    }
     public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
    
    
}