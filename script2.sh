#!/bin/bash

#Display the file name

echo "the name of the script file is $0"

#Display total number of arguments passed to the script

echo "total number of arguments passed to the script = $#"

#Display all the arguments using for loop

if [ $# -gt 0 ]
then

echo "list of arguments"
for arg in $@
do 
  echo "$arg"
done

else

echo "no argument provided to the script."
fi
