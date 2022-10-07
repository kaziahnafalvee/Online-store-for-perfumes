package  Newconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ProductDatabase {
    Connection con;
    public ProductDatabase(Connection con){
        this.con = con;
    }
    public boolean saveProduct(Product product){
        boolean set = false;
        try{
            String query = "insert into product (pName,pPrice,pQuantity) values(?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1,product.getpName());
            
            pst.setString(2,product.getpPrice());
            
            pst.setString(3,product.getpQuantity());
     
            pst.executeUpdate();
           set = true;  
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    //product count
      public  Hashtable<Integer,String> getProductCount(){
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
    }
      
    public List<Product> getAllProducts (){
        Product product =null;
        List<Product> listProduct = new ArrayList();
        //Hashtable<Integer, String> cat = new Hashtable<>();
        try{
            String query = "select * from product";
            PreparedStatement pst = this.con.prepareStatement(query);
            ResultSet rs =pst.executeQuery();
            while(rs.next()){
                 product = new Product();
                 product.setpId(rs.getInt("pId"));
                 product.setpName(rs.getString("pName"));

                 product.setpPrice(rs.getString("pPrice"));

                 product.setpQuantity(rs.getString("pQuantity"));
 

                listProduct.add(product);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listProduct;
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