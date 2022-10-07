
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfumes</title>
        <%@include file="common/cdn.jsp" %>
        <link rel="stylesheet" href="css/common.css" type="text/css">
    </head>
    <body>
        <%@include file="common/header.jsp" %>
        <div class="container signup">
            <div class="alert alert-primary" role="alert">
                Please Login First To Purchase 
            </div>
            <h1 style="align-content: flex-start">Login Here</h1> 
            <form method="post" action="LoginServlet">
             <div class="row">
                    <div class="row">
                        <label><b>Email</b></label>
                        <input class="form-control" type="text" name="email">
                    </div>
                 <br>
                    <div class="row">
                        <label><b>Password</b></label>
                        <input class="form-control" type="password" name="password">
                    </div>
                </div>
                <div class="row">
                    <div class="row">
                        <button type="submit" class="btn btn-success">submit</button>
                         <a href="signup.jsp">Do not have an account? Click Here !</a>
                    </div>
                
                </div>
               
            </form>
             
            
        </div>
                        
        <%@include file="common/footer.jsp" %>
    </body>
</html>