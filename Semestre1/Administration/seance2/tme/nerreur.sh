#!/bin/bash


wc -l <gcc -o $1 2


#solution
gcc -o $1 2> /tmp/erreurs
wc -l /tmp/erreurs #word count ligne 
rm /tmp/erreurs
