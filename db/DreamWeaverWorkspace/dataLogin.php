<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>

<?php

$db_host = $_POST["host"];
$db_username = $_POST["fname"];
$db_pass = $_POST["pass"];
$db_name = $_POST["DB_NAME"];
	

	
?>


<p style="color:blue; font-size:36px">Insert Value</p>
<form action="insertValue.php" method="post"> <br />
Data_Name: <input type="text" name="iName" ><br />
Data_Value: <input type="text" name="iValue" ><br />
<input type="hidden" name="host" value="<?php echo $db_host ?>"  >
<input type="hidden" name="username" value="<?php echo $db_username ?>" >
<input type="hidden" name="pass" value="<?php echo $db_pass ?>"  >
<input type="hidden" name="name" value="<?php echo $db_name ?>"  >
<input type="submit"><br />
</form>


<p style="color:blue; font-size:36px">Retrieve Value</p>
<form action="connect.php" method="get"> <br />
Data_Name: <input type="text" name="iName"  > <br />
Data_Value: <input type="text" name"iValue" > <br />
<input type="hidden" name="host" value="<?php echo $db_host ?>"  >
<input type="hidden" name="username" value="<?php echo $db_username ?>" >
<input type="hidden" name="pass" value="<?php echo $db_pass ?>"  >
<input type="hidden" name="name" value="<?php echo $db_name ?>"  >
<input type="submit" ><br />
</form>



</body>
</html>