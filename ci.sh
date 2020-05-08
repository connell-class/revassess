test(){
    for i in 1 2 3
    do
        git checkout tier$i
        git pull
        cd ./RevassessTier$i/
        pass="`mvn clean test -Dtest=Tier${i}Tests | grep PointsTests`"
        exitCode="`echo $pass | grep -c FAILURE`"
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
    exit 1
else
    echo revassess has been passed
fi