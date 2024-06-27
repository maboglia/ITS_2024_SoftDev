<!DOCTYPE html>
<%@page import="entities.Provincia"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<% String s = (String)request.getAttribute("titolo"); %>
<% List<Provincia> province = (List<Provincia>)request.getAttribute("province"); %>

<h1>Province della regione: </h1>
<h2><%=s%></h2>
<% for (Provincia provincia : province ){ %>
<p><a href="/istat.it/province?regione=<%=provincia%>" ><%=provincia.getComune()%></a></p>


<% } %>

</body>
</html>