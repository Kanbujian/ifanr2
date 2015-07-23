<%@include file="header.jsp" %>

<!--当使用全局异常事件，默认异常信息名为exception，局部异常处理的优先级比全局异常处理高  -->
<h2 class="error" >${exception.message }</h2>
	
<%@include file="footer.jsp" %>
