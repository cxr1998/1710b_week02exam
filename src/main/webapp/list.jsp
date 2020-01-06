<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<script type="text/javascript">
function ccc(){
	var num=$("#tz").val();
	location.href="query?pageNum="+num;
}
	

</script>

<form action="query" method="post">
关键字：<input type="text" name="ckey" value="${map.ckey }"> 描述：<input type="text" name="cdesc" value="${map.cdesc }">
公司名称：<input type="text" name="cname" value="${map.cname }"> 地址：<input type="text" name="location" value="${map.location }">
<br>
 注册资本<input type="text" name="s1" value="${map.s1 }">至<input type="text" name="e1" value="${map.e1 }">
成立时间<input type="text" name="s2" value="${map.s2 }">至<input type="text" name="e2" value="${map.e2 }"><input type="submit" value="查询"><br>
</form>
<table>
  <tr>
    <th>编号</th>
    <th>关键字</th>
    <th>描述</th>
    <th>公司名称</th>
    <th>主营产品</th>
    <th>地址</th>    
    <th>注册资本(万元)</th>
    <th>成立时间</th>
    <th>年检日期</th>
    <th>年检状态</th>
    <th>备注</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list }" var="c">
  <tr>
    <td>${c.id }</td>
    <td>${c.ckey }</td>
    <td>${c.cdesc }</td>
    <td>${c.cname }</td>
    <td>${c.cproduce }</td>
    <td>${c.location }</td>
    <td>${c.cprice }</td>
    <td>${c.ctime }</td>
    <td>${c.cdate }</td>
    <td>${c.cbuff }</td>
    <td>${c.cps }</td>
    <td><a href="show?id=${c.id }">年检审核</a></td>
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="12">
  		当前${plist.pageNum }页/共${plist.pages }页 共${plist.total }条记录
  		<c:forEach begin="1" end="${plist.pages }" step="1" var="t">
  			<a href="query?pageNum=${t }">${t }</a>
  		</c:forEach>
  		<button onclick="ccc()">跳转到</button><input id="tz" type="text">
  	</td>
  </tr>
</table>


</body>
</html>