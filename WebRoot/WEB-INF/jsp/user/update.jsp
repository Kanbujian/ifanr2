<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'add.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div style="margin:30 auto; width:250px;">
    <sf:form method="POST" modelAttribute="user">
    UserName:<sf:input path="username"/> <br/>
    PassWord:<sf:input path="password"/><br/>
    Email    &nbsp; :<sf:input path="email"/><br/>
    <input style="margin:2 auto;" type="submit" value="修改信息"/>
    </sf:form><br>
  </div>
  </body>
</html>
