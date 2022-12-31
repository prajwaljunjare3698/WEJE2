<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String name = request.getParameter("name"); %>    
<% String gender = request.getParameter("gender"); %>    
<% String hobbies[] = request.getParameterValues("hobby"); %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%if(name==null){ %>
		<form action="./form3.jsp" method="post">
	
			<label>Enter name:</label>
			<input type="text" name="name"> <br>
			
			<label>Enter gender:</label>
			<input type="radio" name="gender" value="male">male
			<input type="radio" name="gender" value="female">female <br> <br>
			
			<label>select hobbies:</label>
			<input type="checkbox" name="hobby" value="Travelling">Travelling<br>
			<input type="checkbox" name="hobby" value="Singing">Singing<br>
			<input type="checkbox" name="hobby" value="Swimming">"Swimming"<br>
			<input type="checkbox" name="hobby" value="WebSeries">WebSeries<br>
			
			<input type="submit" name="submit">
		
		</form>
	<%}else{ %>
	
		<h2>name is <%=name %></h2>
		<h2>gender is <%=gender %></h2>
		
		<h3>hobbies are</h3>	if arra is null then exception got...
		<% for(String hobby:hobbies){ %>
			<h2><%=hobby %></h2>
		<%} %>
	
	<%} %>
	

</body>
</html>