#!/bin/bash

testFunction(){ echo "Lewis Test";}
testFunction2(){ echo "Chris Test";}
testFunction3(){ echo "Hello chris";}
testFunction4(){ echo "Hello C";}
testFunction6(){ echo "Hello java java";}
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
	  
testFunction4)
      testFunction4;;
testFunction6)
      testFunction6;;	  
	  
*)

echo "Usage: $0 {testFunction}"

  exit 1
esac
exit 0
