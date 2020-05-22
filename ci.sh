test(){
    for i in 1 2 3
    do
        git checkout tier$i
        git pull
        cd ./RevassessTier$i/
        pass="`mvn clean test -Dtest=Tier${i}Tests`"
        exitCode="`echo $pass | grep PointsTests | grep -c FAILURE`"
      	tierPoints="`echo $pass | grep -oE '_points:[0-9]+' | grep -Eo '[0-9]+'`"
        points="`expr $points + $tierPoints`"
	if (( $exitCode > 0 ))
        then
            failedTier=$i
            break
        fi
        cd ../
    done
    git checkout master
}
test
if [ $failedTier > 0 ]
then
    echo the failed tier was: tier $failedTier
    echo the total number of points are $points
    exit 1
else
    echo revassess has been passed
    echo the total number of points received is $points
fi
