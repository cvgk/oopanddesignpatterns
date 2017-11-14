<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>World Adventure Airlines</title>
<link rel="stylesheet" type="text/css" href="resources/css/deneme.css"/>
</head>
<body>
    <div class="container">
    <div class="title">Add Passenger</div>
    <fieldset>
    <legend>Passenger Details</legend>
     <form action="AddPassenger" method="post">
        <div class="inputfield">
         <label for="firstname" class="inputlabel">First Name:</label>
         <input name="firstname" type="text"/>
        </div>
        <div class="inputfield">
         <label for="lastname" class="inputlabel">Last Name:</label>
         <input name="lastname" type="text"/>
        </div>
        <div class="inputfield">
         <label for="dob" class="inputlabel">Date Of Birth:</label>
         <input name="dob" type="text"/>
        </div>
        <div class="inputfield">
         <label for="firstname" class="inputlabel">Gender:</label>
          <select name="gender">
             <option value="male">Male</option>
             <option value="female">Female</option>
          </select>
        </div>
        
        <div class="inputField" id="submitField">
          <input id="sbmtbtn" type="submit" value="Add New Passenger"/>
        </div>
     </form>
     </fieldset>
     </div>
</body>
</html>