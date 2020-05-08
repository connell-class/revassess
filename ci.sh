test(){
    for i in 1 2
    do
        git checkout tier$i
        git pull
        cd ./RevassessTier$i/
        pass="`mvn clean test | grep PointsTests`"
        exitCode="`echo $pass | grep -c FAILURE`"
        if (( $exitCode > 0 ))
        then
            failedTier=$i
            break 
        fi
        cd ../
    done
    git checkout tier3
	git pull
	cd RevassessTier3
	for i in 3 4 5 
	do
		pass="`mvn clean test -Dtest=Tier${i}Tests`"
		exitCode="`echo $pass | grep PointsTests | grep -c FAILURE`"
		if (($exitCode > 0))
		then
			failedTier=$i
			break
		fi
	done
    mvn clean
    cd ../
    git checkout master
}
test
if [ $failedTier > 0 ]
then
    echo the failed tier was: tier $failedTier
    exit 1
else
    echo revassess has been passed
fi