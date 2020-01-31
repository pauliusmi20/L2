#!/bin/bash

function cp_r {
    for i in * .*
    do
	if [ -d "$i" ]
	then
	    if [ $i != "." ] && [ $i != ".." ]
	    then
		cd $i
		mkdir $1/$i
		cp_r $1/$i
		cd ..
	    fi
	elif [ -f "$i" ]
	then
	    cp "$i" $1
	    touch -r "$i" $1/$i
    elif [ -L "$i"]
    then
        cp "$i" $1
        touch -r "$i" $1/$i
    fi
    done
}

if ! [ -d "$1" ]
then
    echo "$0: '$1' n'est pas un répertoire"
    exit 1
fi

if [ -e "$2" ]
then
    echo "$0: '$2' existe déjà"
    exit 2
fi
 
if [ ${2:0:1} != "/" ]
then
    echo "$0: '$2' n'est pas un chemin absolu"
    exit 3
fi

cd $1
mkdir $2
cp_r $2