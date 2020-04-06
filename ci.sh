git checkout tier1
cd ./RevassessTier1/
$pass= mvn clean test | grep PointsTests
echo $pass
