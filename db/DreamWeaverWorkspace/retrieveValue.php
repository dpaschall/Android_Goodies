<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>

<?php

//Database values
$db_host = $_POST["host"];
$db_username = $_POST["username"];
$db_pass = $_POST["pass"];
$db_name = $_POST["name"];
	

//user input changed values
$iName=$_POST['iName'];
//$iValue=$_POST['iValue'];



$connection=mysql_connect("$db_host","$db_username","$db_pass") or die ("Could not connect to MySQL");
mysql_select_db("$db_name") or die ("No database called " . "$db_name");


//save the MYSQL commands in a string
$sql="SELECT '$iName' FROM phone_number";


while($row = mysql_query($connection, $sql))
{
	
echo $row;
}

mysql_close($connection);
?>


</body>
</html>