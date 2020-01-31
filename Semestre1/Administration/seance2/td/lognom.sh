#/bin/bash




tr ': ' ' :' < /etc/passwd | while read L P U G N R S
do
    if ["$1" = $L]
    then 
        echo $N | tr ":" " "
        exit 0
    fi 
done 
exit 1