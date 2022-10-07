
package Newconnection;

/**
 *
 * @author ASUS
 */
import javax.servlet.http.Part;

public class Product {
    int pId;
   public String pName;
    
    public String pPrice;
   
    public String pQuantity;

 
    public Product(int pId,String pName,String pPrice, String pQuantity){
        this.pId = pId;
        this.pName = pName;

        this.pPrice = pPrice;
    
        this.pQuantity = pQuantity;
         
    }
     public Product(){
        
    }
     public Product(String pName,String pPrice, String pQuantity){
        this.pName = pName;
     
        this.pPrice = pPrice;

        this.pQuantity = pQuantity;

              
    }
     public Product(String pName, String pDesc, String pPrice, String pDiscount, String pQuantity){
        this.pName = pName;
     
        this.pPrice = pPrice;
    
        this.pQuantity = pQuantity;

              
    }

  /*  Product(String pName, String pPrice, String pQuantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     
    public void setpId(int pId){
        this.pId = pId;
    }
    public int getpId(){
        return pId;
    }
    public void setpName(String pName){
        this.pName = pName;
    }
    public String getpName(){
        return pName;
    }
    public void setpPrice(String pPrice){
        this.pPrice = pPrice;
    }
    public String getpPrice(){
        return pPrice;
    }

    public void setpQuantity(String pQuantity){
        this.pQuantity = pQuantity;
    }
    public String getpQuantity(){
        return pQuantity;
    }


   
}
