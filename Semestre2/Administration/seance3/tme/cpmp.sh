#!bin/bash

if [ $# -lt 2 ]
then
    echo Usage $0 arg1 arg2 ... >&2 
    exit 1
fi

src=$1
shift
for i in $(echo $* | tr " " "\n" | sort -u) 
do 
    cp $src $i &
done
echo "-----on attend les pcus....------"
wait
echo "-----fin-----""