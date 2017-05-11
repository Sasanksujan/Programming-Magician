<!DOCTYPE html>
<html>
<head>

<h1><center>Performances of Network Devices and Servers</center></h1>
</head>
<body background="FullSizeRender.jpg">
<body background-position: center;>

<center><a  href="index.html"><input type="submit" value="Home"></a>
<a  href="adddevice.php"><input type="submit" value="Add device"></a>
<a  href="addserver.php"><input type="submit" value="Add server"></a>
<a  href="deletedevice.php"><input type="submit" value="Delete device"></a>
<a  href="deleteserver.php"><input type="submit" value="Delete server"></a>
<a  href="monitor.php"><input type="submit" value="Monitor"></a>
 <h3> Enter the ip of the server to monitor</h3> 

<form action="addserver.php" method="post">
ip:        <input type="text" name="serverip" required><br>
<input type="submit" value="Add server">
</center>
</form>
<?php
if(!empty($_POST["serverip"])) {
 $x= $_POST["serverip"];  


#require "find.php";
$myfile = fopen("../db.conf", "r") or die("Unable to open file!");
eval(fread($myfile,filesize("../db.conf")));
fclose($myfile);

$conn = mysqli_connect($host,$username, $password,$database,$port);

// Check connection
if (!$conn) {
   die("Connection failed: " . mysqli_connect_error());
}
//echo "Connected successfully<br>";
mysqli_select_db($conn,"$database");

$tbl = "CREATE TABLE IF NOT EXISTS server2assignment ( 
                id INT(11) NOT NULL AUTO_INCREMENT,
                server VARCHAR(255) NOT NULL,
                
                PRIMARY KEY (id),
                UNIQUE (id,server) 
                )"; 
$query = mysqli_query($conn, $tbl); 
if ($query === TRUE) {
	#echo "<h3>blockedusers table created OK :) </h3>"; 
} else {
	echo "<h3>blockedusers table NOT created :( </h3>"; 
}
$sqls = "INSERT INTO server2assignment (server)
VALUES (\"$x\")";

if (mysqli_query($conn, $sqls)) {
    echo "New server '$x' added succesfully";
} else {
 echo "error server already exists";
    echo "Error: " . $sqls . "<br>" . mysqli_error($conn);
}
}

?>

</html>
