<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>


<?php

//Database values

$db_host = $_POST["host"];
$db_username = $_POST["username"];
$db_pass = $_POST["pass"];
$db_name = $_POST["name"];
	

	

//user input changed values



$connection=mysql_connect("$db_host","$db_username","$db_pass") or die ("Could not connect to MySQL");
@mysql_select_db("$db_name") or die ("No database called " . "$db_name");


//save the MYSQL commands in a string
$sql="INSERT INTO phone_number (name, mobile) VALUES ('$_POST[iName]','$_POST[iValue]')";


//if the query doesn't work, kill and exit with log
mysql_query($sql) or die('ERROR: ' . mysql_error($connection));	


echo "1 record added";
mysql_close($connection);
?>



<body>
</body>
</html>