<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>${requestScope.PageTitle }</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	    .inCenter{
	      margin:20px auto;width:600px 
	    }
	</style>

  </head>
  
  <body>
  <%-- <p>${requestScope.PageTitle }</p> --%>
 
  

    <div class="inCenter">
       <p style="text-align:center"><a  href="add">添加</a>-----<a href="${LoginUser.username }/show">${LoginUser.username }</a></p>
       
       <!-- map 方式 。user.value -->
       <%-- <c:forEach items="${userMap }" var="user">
       <a href="${user.value.username }/show">${user.value.username } </a>   --------  
       ${user.value.password }    --------
       ${user.value.email }   -------<a href="${user.value.username}/update">修改</a>
       ------<a href="${user.value.username }/delete">删除</a></br>        
       </c:forEach> --%>
       
       
       <!-- list 集合 注意items属性 与addAttribute(String,Object) String对应 -->
       <c:forEach items="${userMap }" var="user">
       <a href="${user.username }/show">${user.username } </a>   --------  
       ${user.password }    --------
       ${user.email }   -------<a href="${user.username}/update">修改</a>
       ------<a href="${user.username }/delete">删除</a></br>  
      
       
       </c:forEach>
       
    </div><br>
  </body>
</html>
