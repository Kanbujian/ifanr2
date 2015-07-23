<%@include file="inheader.jsp" %>

  <div style="margin:20px auto;width:200px"> 
  <h2>User Info</h2>
    UserName:${user.getUsername()}</br>
    Gender  :${user.getUserGender() }</br>
   <%--  PassWord:${user.password}</br> --%>
    Email    &nbsp; :${user.getUserMail() }</br>
    </div>
    
<%@include file="infooter.jsp" %>    
  
  