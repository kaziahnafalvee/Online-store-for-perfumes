
<%@page import="Newconnection.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfumes</title>
        <style>
            .row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #000080;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

span.price {
  float: right;
  color: grey;
}


@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
        </style>
    </head>
    
        <form>
        <div class="row">
  <div class="col-75">
    <div class="container">
        
        <div class="row">
          <div class="col-50">
            <h3>Please check your details for final confirmation</h3>
            <label for="fname"><i class="fa fa-user"></i>Your Full Name</label>
            <input type="text" id="fname" name="firstname" value="${firstname}">
            <!--<label for="email"><i class="fa fa-envelope"></i>Your Email</label>
            <input type="text" id="email" name="email" value="${email}">-->
            <label for="adr"><i class="fa fa-address-card-o"></i> Your Address</label>
            <input type="text" id="adr" name="address" value="${address}">
           

            <!--<div class="row">
              <div class="col-50">
                <label for="state">State</label>
                <input type="text" id="state" name="state" placeholder="NY">
              </div>
              <div class="col-50">
                <label for="zip">Zip</label>
                <input type="text" id="zip" name="zip" placeholder="10001">
              </div>
            </div>
          </div>-->
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="${cardnumber}">
            <!--<label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="September">-->
            
       
            <h3>Your Products </h3>
           
           <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Product Name</b></th> 
          <th><b>Product Quantity</b></th> 
          <th><b>Product Price</b></th> 
         </tr>
              <% List<Product> allpro = (List<Product>)request.getAttribute("product_list");
                  for(Product p :allpro) { %>
        <tr>      
            <td><%=p.getpName()%></td> 
            <td><%= p.getpQuantity()%></td> 
            <td><%=p.getpPrice()%></td> 
        </tr>
        <%}%> 
 
        <p><b>Total Price</b> : ${total}</p>
           </table>
           <!-- <div class="row">
              <div class="col-50">
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
             <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352">
              </div>-->
            </div>
          </div>

        </div>
        <input type="submit" value="COMFIRM" class="btn">
        
        <a href="loggedIn.jsp"><b>CANCEL</b></a>
      </form>
    </div>
  </div>

  
 
        </form>
    


