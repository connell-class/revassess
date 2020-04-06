git checkout tier1
git pull
cd ./RevassessTier1/
pass= mvn clean test | grep PointsTests
echo $pass
git checkout master