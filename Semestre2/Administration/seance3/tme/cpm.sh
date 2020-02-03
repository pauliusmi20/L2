#!bin/bash

if [ $# -lt 2 ]
then
    echo Usage $0 arg1 arg2 ... >&2 
    exit 1
fi

src=$1
shift
for i in $* 
do 
    cp $src $i 
done
echo "-----fin-----""