<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>
     login
</title>
<body>

<h1>Student Page</h1>

<form action = "/pooja" method = "post">
     Id <input type="text" name="id"><br><br>
     Name <input type="text" name="name"><br><br>
     Email <input type="text" name="email"><br><br>
     <label>Gender</label>

     <select name ="gender">
          <option value="Male">Male</option>
          <option value="Female">Female</option>
     </select><br><br>
     DOB <input type="date" name="dob"><br><br>
     Contact <input type="text" name="contact"><br><br>
      <input type="submit" value="Upload">
</form>
</body>

</html>