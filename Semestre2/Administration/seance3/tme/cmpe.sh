#!bin/bash

if [ $# -lt 2 ]
then
    echo Usage $0 arg1 arg2 ... >&2 
    exit 1
fi

src=$1
shift
for i in $* 
do 0
    cp $src $i 
    err=$?
    if [ $err -ne 0 ]
    then 
        echo erreur: err
        exit $err
    fi
done
echo "-----fin-----""