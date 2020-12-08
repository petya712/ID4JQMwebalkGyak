<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("https://i.gyazo.com/dfa9229ab535c395026644f1a442bc89.png");
}

h1 { color: darkblue;
  text-align: center; }

a:link, a:visited {
  background-color: #62D318;
  color: black;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: white;

</style>
<meta charset="UTF-8">
<title>Peticom service</title>
</head>
<body>


<h1>Peticom service</h1>
<br><h2>All customers in database:</h2><br>
	${customers}<br>

	<a href="http://localhost:8080/home" target="_blank">Menu</a>

</body>
</html>