<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Success</title>
</head>

<body style="background-image:url(umb.jpg); background-position:top; background-size:auto;">

<h1 style="color:#FF0000; text-align:center;font-family:'Arial Black', Gadget, sans-serif;font-size:80px">SUCCESS</h1>
<br><br><br><br><br>


<?php

//Database values
$db_host = $_POST["host"];
$db_username = $_POST["username"];
$db_pass = $_POST["pass"];
$db_name = $_POST["name"];
	

//user input changed values, if !=null;
if (isset($_POST['iName']))    
{    
        
$name=$_POST['iName'];
}    

if (isset($_POST['iValue']))    
{    
        
$value=$_POST['iValue'];
}    



$connection=mysql_connect("$db_host","$db_username","$db_pass") or die ("Could not connect to MySQL");
mysql_select_db("$db_name") or die ("No database called " . "$db_name");


//save the MYSQL commands in a string
$sql=mysql_query("SELECT * FROM phone_number WHERE name='$name'");


while($row = mysql_fetch_array($sql))
{
	
	
echo '<font color="blue"><strong>NAME:</strong></font> ' . '<font color="blue"><strong>' . $row['name'] . '</strong></font>' . '<br><font color="blue"><strong> MOBILE:</strong></font>' .  $row['mobile'] ;

echo "<br>";
}

mysql_close($connection);
?>


</body>
</html>