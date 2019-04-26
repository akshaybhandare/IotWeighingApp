<?php
$servername = "http://ec2-13-232-43-171.ap-south-1.compute.amazonaws.com/getdata.php"
$username = "root";
$password = "AB8498";
$dbname = "putw";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// enter your sql query
    $sql = "Select * from putw where time = (SELECT MAX(time) from putw) ";
// Creates temp array variable
$temp = array();
// Gets table details
$result = mysql_query($sql);
// Adds each records/row to $temp
while($row=mysql_fetch_row($result)) {
    $temp[] = $row;
}
// Formats json from temp and shows/print on page
echo json_encode($temp);
?>


/*totally working*/

<?php
$servername = "localhost";
$username = "root";
$password = "AB8498";
$dbname = "putw";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected Successfully\n \t" ;

$sql="SELECT weight FROM putw where time = (select MAX(time) from putw)";

if ($result=mysqli_query($conn,$sql))
  {
  // Fetch one and one row
  if($row=mysqli_fetch_row($result))
    {
//    printf ("%s \n",$row[0]);
        $temp=$row[0];
    }
        echo json_encode($temp);
  // Free result set
  mysqli_free_result($result);
}

mysqli_close($conn);

?>


applinking

<?php
$servername="localhost";
$user="root";
$password="AB8498";
$db="putw";

$conn = mysqli_connect($servername,$user,$password,$db);

$query = "select * from putw ;";

$result =mysqli_query($conn,$query);
$response = array();

while($row = mysqli_fetch_array($result))
{
        array_push($response,array('id'=>$row[0],'orderid'=>$row[1],'weight'=>$row[2],'time'=>$row[3]));

}

mysqli_close($conn);

echo json_encode(array('server_response'=>$response));

?>

////////////////////////////////////////////////////
to database

<?php

$servername = "localhost";
$username = "pmauser";
$password = "8498";
$dbname ="GetDataTable";

 $con = mysqli_connect($servername,$username,$password,$dbname);

if ($con->connect_error){
        die("Connection failed: ".$con->connect_error);
}
echo "Connection Successful\n\t";

 $name = $_POST['name'];
 $usn = $_POST['usn'];

 $Sql_Query = "insert into GetDataTable (name,usn) values ('$name','$usn')";
 $Sql_Query = "select usn from GetDataTable where name='$name' ";


 if(mysqli_query($con,$Sql_Query)){

 echo 'Data Submit Successfully';

 }
 else{

 echo 'Try Again';

 }
 mysqli_close($con);
?>



