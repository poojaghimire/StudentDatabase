<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>
login
</title>
<body>

<h1>Administrator Login Page</h1>

<form action = "/login" method = "post">
    Name <input type="text" name="name">
     Password <input type="password" name="pwd"><br><br>
    <input type="submit" value="Login">
</form>
<br><br>
<h1>Not a user yet! Sign Up below:</h1> <br><br>
<form action = "/signup" method = "post">
    Name <input type="text" name="reg_name">
     Password <input type="password" name="reg_password"><br><br>
     Email <input type="email" name="email"><br><br>
    <input type="submit" value="SignUp">
</form>
</body>
</body>

</html>