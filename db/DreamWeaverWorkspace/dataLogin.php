<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body style="background-image:url(warcraft_Desktop.jpg);background-size:cover;">

<?php

$db_host = $_POST["host"];
$db_username = $_POST["fname"];
$db_pass = $_POST["pass"];
$db_name = $_POST["DB_NAME"];
	

//test connections
$connection=mysql_connect("$db_host","$db_username","$db_pass") or die ("Could not connect to MySQL");
mysql_select_db("$db_name") or die ("No database called " . "$db_name");


?>


<p style="color:red; font-size:36px; font-family:Verdana, Geneva, sans-serif;"><strong>Insert Value</strong></p>
<form action="insertValue.php" method="post"> <br />
<p style="color:red;">Data_Name:<input type="text" name="iName" ></p>
<p style="color:red;">Data_Value: <input type="text" name="iValue" ></p><br />
<input type="hidden" name="host" value="<?php echo $db_host ?>"  >
<input type="hidden" name="username" value="<?php echo $db_username ?>" >
<input type="hidden" name="pass" value="<?php echo $db_pass ?>"  >
<input type="hidden" name="name" value="<?php echo $db_name ?>"  >
<input type="submit"><br />
</form>


<p style="color:red; font-size:36px; font-family:Verdana, Geneva, sans-serif;"><strong>Retrieve Value</strong></p>
<form action="retrieveValue.php" method="post"> <br />
<p style="color:red;">Data_Name: <input type="text" name="iName"  ></p> 
 <br />
<input type="hidden" name="host" value="<?php echo $db_host ?>"  >
<input type="hidden" name="username" value="<?php echo $db_username ?>" >
<input type="hidden" name="pass" value="<?php echo $db_pass ?>"  >
<input type="hidden" name="name" value="<?php echo $db_name ?>"  >

<p style="color:red;"> (Only one value is required...")</p>
<input type="submit" ><br />
</form>



</body>
</html>