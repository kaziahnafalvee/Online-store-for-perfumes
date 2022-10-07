package  Newconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class CheckoutDatabase {
    Connection con;
    public CheckoutDatabase(Connection con){
        this.con = con;
    }
    public boolean saveCard( Card card){
        boolean set = false;
        try{
            String del_query = "Delete from card ";
            PreparedStatement del = this.con.prepareStatement(del_query);
            del.executeUpdate();
            
            String query = "insert into card (firstname,email,address, cardname, cardnumber) values(?,?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1,card.firstname);
            
            pst.setString(2,card.email);
            
            pst.setString(3,card.address);
            pst.setString(4, card.cardname);
            pst.setString(5, card.cardnumber);
     
            pst.executeUpdate();
           set = true;  
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    //product count
      /*public  Hashtable<Integer,String> getProductCount(){
       Product product = null;
       Hashtable<Integer, String> map = new Hashtable<>();
        try{
            String query = "select * from product";
            PreparedStatement pst = this.con.prepareStatement(query);
            ResultSet rs =pst.executeQuery();
   
            while(rs.next()){
                  product = new Product();
                 product.setpId(rs.getInt("pId"));
                 product.setpName(rs.getString("pName"));
                 int id = product.getpId();
                 String s = product.getpName();
                map.put(id,s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
       return map;
    } */
      
    public List<Card> getCardDetails (){
        Card card =null;
        List<Card> CardDetails = new ArrayList();
        //Hashtable<Integer, String> cat = new Hashtable<>();
        try{
            String query = "select * from card";
            PreparedStatement pst = this.con.prepareStatement(query);
            ResultSet rs =pst.executeQuery();
            while(rs.next()){
                card = new Card();
                 card.cID=rs.getInt("cId");
                 card.firstname=(rs.getString("firstname"));
                 card.address=(rs.getString("address"));
                 card.cardname=(rs.getString("cardname"));
                 card.cardnumber=(rs.getString("cardnumber"));
 

                CardDetails.add(card);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return CardDetails;
    }  
    
    
/*   get all products of given category
    public List<Product> getAllProductsById (int cid){
        Product product =null;
        List<Product> listProduct = new ArrayList();
        //Hashtable<Integer, String> cat = new Hashtable<>();
        try{
            String query = "select * from product as p where p.catId = ? " ;
            
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setInt(1,cid);
            ResultSet rs =pst.executeQuery();
            while(rs.next()){
                 product = new Product();
                 product.setpId(rs.getInt("pId"));
                 product.setpName(rs.getString("pName"));
                 product.setpDesc(rs.getString("pDesc"));
                 product.setpPrice(rs.getInt("pPrice"));
                 product.setpDiscount(rs.getInt("pDiscount"));
                 product.setpQuantity(rs.getInt("pQuantity"));
                 product.setpPic(rs.getString("pPic"));
                 product.setcatId(rs.getInt("catId"));
                 //product.setCatId(rs.getInt("catId"));
//                 String s =category.getCatTitle();
//                 int id = category.getCatId();
                listProduct.add(product);
                //cat.put(id,s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listProduct;
    }  */


}