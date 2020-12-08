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

  .dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
  }

  .dropdown {
    position: relative;
    display: inline-block;
  }

  .dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
  }

  .dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
  }

  .dropdown-content a:hover {background-color: #f1f1f1}

  .dropdown:hover .dropdown-content {
    display: block;
  }

  .dropdown:hover .dropbtn {
    background-color: #3e8e41;
  }

</style>
<meta charset="UTF-8">
<title>Peticom service</title>
</head>
<body>
<h1>Peticom service</h1>

<div class="dropdown">
  <button class="dropbtn">Menu</button>
  <div class="dropdown-content">
  <a href="http://localhost:8080/home">Add customers</a>
  <a href="http://localhost:8080/home">Search for customers</a>
  <a href="http://localhost:8080/home">Delete customers</a>
  <a href="http://localhost:8080/logout">Logout</a>
  </div>
</div> <br>


	<h2>Update or save new customers:</h2><br>

    	<form action="updateCustomers">
        	<input type="text" name="custid" placeholder=ID ><br>
        	<input type="text" name="custname" placeholder=Name ><br>
        	<input type="text" name="custidcard" placeholder=Personal_ID_card_number ><br>
        	<input type="text" name="custplaceb" placeholder=Place_of_birth ><br>
        	<input type="text" name="custmother" placeholder=Mothers_name ><br>
        	<input type="text" name="custbirth" placeholder=Date_of_birth ><br>
        	<input type="submit"><br>
        	</form>

	<h2>Search for customer by ID:</h2><br>

	<form action="getCustomers">
	<input type="text" name="custid" placeholder=ID ><br>
	<input type="submit"><br>
	</form>

	<h2>Delete customer by ID:</h2><br>

	<form action="delCustomers">
    	<input type="text" name="custid" placeholder=ID ><br>
    	<input type="submit"><br>
    	</form>

<h2>List all customers:</h2><br>

    <form action="listCustomers" method="post">
        <input type="submit" name="button1" value="Button 1"><br>
        <button type="submit"><br>

    </form>


</body>
</html>

