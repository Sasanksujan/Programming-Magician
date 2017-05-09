<!DOCTYPE html>
<html>
<head>

<h1><center>Performances of Network Devices and Servers</center></h1>
</head>
<body>
<body background="FullSizeRender.jpg">
<body background-position: center;>

<center><a  href="index.html"><input type="submit" value="Home"></a>
<a  href="adddevice.php"><input type="submit" value="Add device"></a>
<a  href="addserver.php"><input type="submit" value="Add server"></a>
<a  href="deletedevice.php"><input type="submit" value="Delete device"></a>
<a  href="deleteserver.php"><input type="submit" value="Delete server"></a>
<a  href="monitor.php"><input type="submit" value="Monitor"></a></center>
 <h3> Select the device to be removed </h3>
 <?php 
 $myfile = fopen("../db.conf", "r") or die("Unable to open file!");
eval(fread($myfile,filesize("../db.conf")));
fclose($myfile);
# require "find.php";
$conn = mysqli_connect($host,$username, $password,$database,$port);
// Checkconnection
if (!$conn) {
   die("Connection failed: " . mysqli_connect_error());
}
echo "Connected successfully<br>";
mysqli_select_db($conn,"$database");
if (!empty($_POST['delete_list1'])) 
{
foreach($_POST['delete_list1'] as $value)
										 {
														echo "$value<br>"; 
														$sql = "DELETE FROM sassign2 WHERE id=$value";

														if (mysqli_query($conn, $sql)) {
																echo "Record deleted successfully";
														} else {
																echo "Error deleting record: " . mysqli_error($conn);
														}
												
										}


}
 echo "<form action='' method=post>";
 $result = mysqli_query($conn,"SELECT id,IP, PORT, COMMUNITY  FROM sassign2");
 echo "<table>";
 echo "<tr><th>Select</th><th>Ip</th><th>Port</th><th>Community</th></tr>";
 
 while($row = mysqli_fetch_array($result))
 {
 echo "<tr><td><input type='checkbox' name='delete_list1[]' value=$row[id]></td><td>$row[IP]</td><td>$row[PORT]</td><td>$row[COMMUNITY]</td></tr>";
 
 }
 
  echo "</table>";
 echo "<input type=submit value='delete device'>";
 echo "</form>";


 
 
 ?>

