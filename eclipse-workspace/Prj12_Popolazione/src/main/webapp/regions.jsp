<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<% String s = (String)request.getAttribute("titolo"); %>
<% List<String> regioni = (List<String>)request.getAttribute("regioni"); %>

<h1>Regioni d'Italia</h1>
<h2><%=s%></h2>
<% for (String regione : regioni){ %>
<p><a href="/istat.it/province?regione=<%=regione%>" ><%=regione%></a></p>
<% } %>

</body>
</html>