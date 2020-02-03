#!bin/bash

cat  0-3*15 * * * 5 bash pstop.sh >> script

crontab < script >> res