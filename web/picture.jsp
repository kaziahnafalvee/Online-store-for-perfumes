<%-- 
    Document   : picture
    Created on : Dec 15, 2020, 1:34:01 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfumes</title>
        <%@include file="common/cdn.jsp" %>
        <link rel="stylesheet" href="css/common.css" type="text/css">
        <!--<style> 
            h1{
                font-size: 10;
            }
            </style>-->
    </head>
    
    <body>
        <div class="row">
        <form method="post" action="CartServlet">
            <div class="card">
            <img src="css/img/bvlgari-purple.jpg" alt="Perfume" style="width:100%">
            <h1>BVLGARI OMNIA</h1>
            <p class="price">$25.00</p>
            <input type="hidden" name="price" value="25.00" />
            <p>65 ML</p>
            <input type="hidden" name="quantity" value="65 ML"/>
            <p>for women</p>
            <p><button type="submit" name="perfume_name" value="BVLGARI OMNIA">Add to Cart</button></p>
       
        </div>
        </form>
        
         <form method="post" action="CartServlet">
         <div class="card">
            <img src="css/img/Dolce-Gabbana-The-Only-One-2-2.jpg" alt="Perfume" style="width:100%">
            <h1>Dolce & Gabbana The Only One</h1>
            <p class="price">$55.00</p>
            <input type="hidden" name="price" value="55.00"/>
            <p>100 ML</p>
            <input type="hidden" name="quantity" value="100 ML"/>
            <p>for women</p>
           
            <p><button type="submit" name="perfume_name" value="Dolce & Gabbana The Only One">Add to Cart</button></p>
        </div>
         </form>
             
         <form method="post" action="CartServlet">
         <div class="card">
            <img src="css/img/MARC JACOBS.jfif" alt="Perfume" style="width:100%">
            <h1>MARC JACOBS</h1>
            <p class="price">$65.00</p>
            <input type="hidden" name="price" value="65.00"/>
            <p>30 ML</p>
            <input type="hidden" name="quantity" value="30 ML"/>
            <p>for women</p>
            <p><button type="submit" name="perfume_name" value="MARC JACOBS">Add to Cart</button></p>
        </div>
         </form>
        </div>
      
        <div class="row">
         <form method="post" action="CartServlet">
            <div class="card">
                <img src="css/img/bvlgari men.png" alt="Perfume" style="width:100%">
            <h1>BVLGARI SPLENDIDA</h1>
            <p class="price">$45.00</p>
            <input type="hidden" name="price" value="45.00"/>
            <p>30 ML</p>
            <input type="hidden" name="quantity" value="30 ML"/>
            <p>for men</p>
            <p><button type="submit" name="perfume_name" value="BVLGARI SPLENDIDA">Add to Cart</button></p>
            </div>
            </form>

        
            
            <form method="post" action="CartServlet">
            <div class="card">
            <img src="css/img/Gucci-Made-to-Measure1.jpg" alt="Perfume" style="width:100%">
            <h1>GUCCI Made To Measure</h1>
            <p class="price">$30.00</p>
            <input type="hidden" name="price" value="30.00"/>
            <p>50 ML</p>
            <input type="hidden" name="quantity" value="50 ML"/>
            <p>for men</p>
            <p><button type="submit" name="perfume_name" value="GUCCI Made To Measure">Add to Cart</button></p>
            </div>
            </form>
            
             <form method="post" action="CartServlet">
             <div class="card">
            <img src="css/img/DIOR-JOY.jpg" alt="Perfume" style="width:100%">
            <h1>Christian DIOR JOY</h1>
            <p class="price">$40.00</p>
            <input type="hidden" name="price" value="40.00"/>
            <p>40 ML</p>
            <input type="hidden" name="quantity" value="40 ML"/>
            <p>for women</p>
            <p><button type="submit" value="Christian DIOR JOY" name="perfume_name">Add to Cart</button></p>
        </div>
             </form>
        </div>
        <div class="row">
              <form method="post" action="CartServlet">
      
            <div class="card">
            <img src="css/img/VS-PINK.jpg" alt="Perfume" style="width:100%">
            <h1>VS PINK CRUSH</h1>
            <p class="price">$30.00</p>
            <input type="hidden" name="price" value="30.00"/>
           <p>30 ML</p>
           <input type="hidden" name="quantity" value="30 ML"/>
            <p>for women</p>
            <p><button type="submit" name="perfume_name" value="VS PINK CRUSH">Add to Cart</button></p>
        </div>
       
              </form>
            
             <form method="post" action="CartServlet">
            <div class="card">
            <img src="css/img/CHANEL-COCO.jpg" alt="Perfume" style="width:100%">
            <h1>COCO CHANNEL</h1>
            <p class="price">$40.00</p>
            <input type="hidden" name="price" value="40.00"/>
            <p>40 ML</p>
            <input type="hidden" name="quantity" value="40 ML"/>
            <p><button type="submit" name="perfume_name" value="COCO CHANNEL" >Add to Cart</button></p>
        </div>
             </form>
           
          <form method="post" action="CartServlet">        
         <div class="card">
            <img src="css/img/VS-BOMBSHELL.jpg" alt="Perfume" style="width:100%">
            <h1>VS BOMBSHELL</h1>
            <p class="price">$35.00</p>
            <input type="hidden" name="price" value="35.00"/>
           <p>50 ML</p>
           <input type="hidden" name="quantity" value="50 ML"/>
            <p>for women</p>
            <p><button type="submit" name="perfume_name" value="VS BOMBSHELL">Add to Cart</button></p>
        </div>
          </form>
        </div>
    </body>
        </html>