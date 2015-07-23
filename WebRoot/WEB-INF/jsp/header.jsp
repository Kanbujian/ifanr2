<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ page import="com.kanbujian.model.User" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <title>${PageTitile}</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	I’m header.jsp
	-->
    
     <link href="css/bootstrap.min.css" rel="stylesheet">
    
  </head>
  
  <body>
 <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="http://localhost:8080/ifanr2/index">My ifanr</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	   <form class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      
      <ul class="nav navbar-nav navbar-right" >
        <li class="active"><a href="http://localhost:8080/ifanr2/index">Home Page <span class="sr-only">(current)</span></a></li>
        <li><a href="http://www.kanbujian.net/wordpress">iNora</a></li>
		 <li><a href="http://kanbujian.net/phpmyadmin">Constrution</a></li>
		 
       <!--  <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">User <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li></li>
            
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>          
        </li> -->
        
        <li>
        <%
        User u=(User)session.getAttribute("LoginUser");
        if(u==null){ %>
        <a href="http://localhost:8080/ifanr2/index">Login</a>
        <%} else { %>
          <a href="/ifanr2/user/<%=u.getUsername() %>/show"><%=u.getUsername() %> </a>  
          <% }%>     	
        
        </li>
        
      </ul>
     
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
 
 <div >