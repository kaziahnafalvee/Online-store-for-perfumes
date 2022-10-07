
package Newconnection;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import javax.servlet.http.Part;

public class Card {
    public int cID;
    public String firstname;
    
    public String email;
   
    public String address;
    public String cardname;
    public String cardnumber;
    
    public Card(){
        
    }

 
    public Card(int cId,String firstname,String email, String address, String cardname, String cardnumber){
        this.cID =  cId;
        this.firstname = firstname;

        this.email = email;
    
        this.address = address;
        this.cardname = cardname;
        this.cardnumber = cardnumber;
         
    }
        public Card(String firstname,String email, String address, String cardname, String cardnumber){
    
        this.firstname = firstname;

        this.email = email;
    
        this.address = address;
        this.cardname = cardname;
        this.cardnumber = cardnumber;
         
    }
     /*public Product(){
        
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

              
    } */

  /*  Product(String pName, String pPrice, String pQuantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     
    /*public void setpId(int pId){
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

*/
   
}
