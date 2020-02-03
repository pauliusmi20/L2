#!bin/bash

# l'entete de s'affiche pas qd on met = suivi de vide
ps  -eo time=,uid=,pid=,command= | sort -rn | head -1
