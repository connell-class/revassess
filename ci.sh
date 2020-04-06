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
    git checkout master
}
if [ $failedTier > 0 ]
then
    echo the failed tier was: tier @failedTier
else
    echo revassess has been passed
fi