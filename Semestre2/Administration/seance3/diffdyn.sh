#!bin/bash

if [ $# -ne 2 ] # si nb arg pas egal 2
then 
    echo Usage $0 fichier1 fichier2 >&2
    exit 3
fi 

sort -u $1 > /tmp/diffdyn1$$.diff
sort -u $2 > /tmp/diffdyn2$$.diff
diff /tmp/diffdyn1$$.diff /tmp/diffdyn2$$.diff
n=$?
rm  /tmp/diffdyn1$$.diff /tmp/diffdyn2$$.diff

#solution 2
diff < (sort -u $1) < (sort -u $2) >> res 
