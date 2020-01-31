#!/bin/bashIF 

if [ $# -ne 1]
then 
    echo Usage $0 fichier >&2
    exit 1
fi  

cat << EOF >> $1
PATH="$PATH"
EOF

cat <<"EOF" >> $1
PATH="$HOME/bin"
EOF


