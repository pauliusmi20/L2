#!/bin/bash

cat $1 | while read a b 
do 
if [ -z "$b" ] 
then
    echo $a 
fi 
done > $2



#autre solution,:

while read a b
do 
if [ -z "$b" -a -n "$a" ] 
    then echo $a
fi
done < $1 > $2