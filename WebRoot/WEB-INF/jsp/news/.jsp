<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@include file="inheader.jsp" %>
   
   <h2>Article Info</h2>
   
  <c:forEach items="${newsMap }" var="news">
      <div style="width:640px ;height:340px ;margin:20px auto;padding:20px 20px" >
         <div style="width:640px ;height:40px ;margin:10px auto;padding:5px 5px">
           <h3><a href="/news/${news.getNewsId().toString()}">${news. getTitle()}</a></h3>          
         <div style="width:200px ;height:145px ;">
           <img alt=${news. getTitle()} src="../images/${news. getTitle()}.jpg">
         </div>
         
         <div style="width:400px ;height:145px ;position: relative; left: 210px;
          bottom: 145px;margin:0px 20px;">
          <p>${news.getContent() }</p>
          
         </div>
         
         </div>
         
    
      </div>
  </c:forEach>
  
  
    
<%@include file="infooter.jsp" %>    
  
  