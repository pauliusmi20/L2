#!bin/bash

if [ $# -ne 1]
then 
    echo Usage $0 mail-adress >&2
    exit 1
fi 
save='courrier-interrompu.txt'
trap 'mv $msgfile $save;echo "sauvegarde dans $save";exit 2' INT TERM
msgfile="courier.txt"
cat > $msgfile < mail $msgfile # correction no final ... a modifier
