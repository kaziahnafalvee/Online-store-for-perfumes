

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
            <h1>Sign up here!</h1>
            <form method="post" action="SignUpServlet">
                <div class="row">
                    <div class="row">
                        <label>Name</label>
                        <input class="form-control" type="text" name="name" required>
                    </div>
                    <div class="row">
                        <label>contact</label>
                        <input class="form-control" type="text" name="contact" required>
                    </div>
                </div>
                <div class="row">
                    <div class="row">
                        <label>Email</label>
                        <input class="form-control" type="email" name="email" required>
                    </div>
                    <div class="row">
                        <label>password</label>
                        <input class="form-control" type="password" name="password" required>
                    </div>
                </div>
                <div class="row">
                    <div class="row">
                        <button tytype="submit" class="btn btn-success">submit</button>
                        <a href="login.jsp">Sign up done already?</a>
                    </div>
                </div>
            </form>
        </div>
                        
        <%@include file="common/footer.jsp" %>
    </body>
</html>
