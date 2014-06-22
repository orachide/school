<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${site.remote_jquery}">
	<!--[if !IE]> -->
<script src="${site.protocol}//ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<!-- <![endif]-->
<!--[if IE]>
<script src="${site.protocol}//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->    		
</c:if>

<!--[if !IE]> -->
<script type="text/javascript">
 window.jQuery || document.write("<script src='${path.assets}/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
</script>
<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='${path.assets}/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
	if("ontouchend" in document) document.write("<script src='${path.assets}/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
