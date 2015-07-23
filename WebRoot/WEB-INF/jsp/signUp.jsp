<%@include file="header.jsp" %>

<h1 align="center"> Sign Up </h1>
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
    <label for="pass" class="col-sm-2 control-label">Gender</label>
    <div class="col-sm-10">
      <input type="gender" class="form-control" id="gender" name="gender" placeholder="gender">
    </div>
  </div>
  <div class="form-group">
    <label for="pass" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="email" name="email" placeholder="email">
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
      <button type="submit" class="btn btn-default">Sign Up</button>
    </div>
  </div>
</form>
	
<%@include file="footer.jsp" %>


