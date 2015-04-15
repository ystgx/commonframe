<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>common</title>
<meta name="keywords"
	content="common" />
<meta name="description"
	content="common" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<%@ include file="/WEB-INF/jsp/common/import_css.jsp"%>
<%@ include file="/WEB-INF/jsp/common/import_js.jsp"%>

<!-- iframe高度自适应 -->
<script type="text/javascript">
    function reinitIframe(){
    var iframe = document.getElementById("iframepage");
    try{
    var bHeight = iframe.contentWindow.document.body.scrollHeight;
    var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
    var height = Math.max(bHeight, dHeight);
    iframe.height =  height;
    }catch (ex){}
    }
    window.setInterval("reinitIframe()", 200);
</script>


</head>

<body>

	<%@ include file="navbar.jsp"%>

	<%@ include file="menu.jsp"%>

	<div class="main-content">
		<div class="breadcrumbs" id="breadcrumbs">
			<script type="text/javascript">
				try {
					ace.settings.check('breadcrumbs', 'fixed')
				} catch (e) {
				}
			</script>

			<ul class="breadcrumb">
				<li><i class="icon-home home-icon"></i> <a href="#">首页</a></li>
				<li class="active">控制台</li>
			</ul>
			<!-- .breadcrumb -->

			<div class="nav-search" id="nav-search">
				<form class="form-search">
					<span class="input-icon"> <input type="text"
						placeholder="Search ..." class="nav-search-input"
						id="nav-search-input" autocomplete="off" /> <i
						class="icon-search nav-search-icon"></i>
					</span>
				</form>
			</div>
			<!-- #nav-search -->
		</div>

		<iframe name="content" id="iframepage" tabs="true" width="100%"
			height="768" marginheight="0" marginwidth="0" frameborder="0"
			onLoad="reinitIframe();" src="${ctx}/admin/welcome"></iframe>
	</div>


	<%-- 	<%@ include file="welcome.jsp"%> --%>



</body>


</html>
