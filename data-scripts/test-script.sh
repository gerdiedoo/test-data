#! /bin/bash
  
file='links.txt'  

while read line; do
    str=$(echo "$line" | tr -d '\r')
    xdg-open $str &
    # echo "xdg-open $str"
done < $file  
