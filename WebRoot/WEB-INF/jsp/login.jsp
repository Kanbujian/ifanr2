<%@include file="header.jsp" %>

<!-- 显示提示信息，如没有登陆访问用户信息，或者前端表单验证结果 -->
<%-- <h2 align="center" ><%=request.getParameter("errorMessqge") %></h2> --%>

<h1 align="center"> Login </h1>
<form  method="POST" class="form-horizontal" style="width:32%;margin:20px auto;">
  <div class="form-group">
    <label for="username" class="col-sm-2 control-label">Username</label>
    <div class="col-sm-10">
      <input type="username" class="form-control" id="username" name="username" placeholder="Username">
    </div>
  </div>
  <div class="form-group">
    <label for="pass" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="password" name="password" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
  </div>
</form>
	
<%@include file="footer.jsp" %>


