
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
<h4>审核记录</h4>
关键字：<input type="text" name="ckey" value="${colum.ckey }"> 描述：<input type="text" name="cdesc" value="${colum.cdesc }"><br>
编号：<input type="text" name="id" value="${colum.id }"> 公司名称：<input type="text" name="cname" value="${colum.cname }"><br>
主营产品：<input type="text" name="cproduce" value="${colum.cproduce }">;地址：<input type="text" name="location" value="${colum.location }"> 
注册资本：<input type="text" name="cprice" value="${colum.cprice }">
成立时间：<input type="text" name="ctime" value="${colum.ctime }"><br>
年检日期：<input type="text" name="cdate" value="${colum.cdate }"> 年检状态：<input type="text" name="cbuff" value="${colum.cbuff }">；
备注：<input type="text" name="cps" value="${colum.cps }" width="100px" height="275px">
</body>
</html>