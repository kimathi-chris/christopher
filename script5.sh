#!/bin/bash

testFunction(){ echo "Lewis Test";}
testFunction2(){ echo "Chris Test";}
testFunction3(){ echo "Hello chris";}
testFunction4(){ echo "Hello C";}
testFunction5(){ echo "Hello kim";}
testFunction6(){ echo "Riverbank Solutions LTD";}
update(){ echo "git pull origin master";}

#Expose commands to handle the app
case "$1" in
testFunction)
      testFunction;;

testFunction2)
      testFunction2;;

testFunction3)
      testFunction3;;
	  
testFunction4)
      testFunction4;;


testFunction5)
      testFunction5;;

testFunction6)
      testFunction6;;

update)
    update;;
	  
*)

echo "Usage: $0 {testFunction}"

  exit 1
esac
exit 0
