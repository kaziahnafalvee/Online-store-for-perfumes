import javax.servlet.http.Part;


public class product {
    int pid;
    String name;
    int price;
    int quantity;
    int catId;
    
  
    
   
    public product(int pid,String name, int price, int quantity, int catId){
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.catId = catId;     
    }
    
     public product(){
        
     }
     
     public product(String name, int price, int quantity, int catId){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.catId = catId;

              
    }
     public product(String name, int price,  int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
     
    public void setpid(int pid){
        this.pid = pid;
    }
    public int getpid(){
        return pid;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setprice(int price){
        this.price = price;
    }
    public int getprice(){
        return price;
    }

    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    public int getquantity(){
        return quantity;
    }
    public void setcatId(int catId){
        this.catId = catId;
    }
    public int getcatId(){
        return catId;
    }

    
// discount price
   // public int getPriceAfterDiscount(){
       // int d = (int)((this.getpDiscount()/100.0)*this.getprice());
        
        //return this.getprice()-d;
    }


   
