import java.util.*;
class Sum{
public static void main(String[] args){
int a,b,add;

Scanner buf = new Scanner(System.in);
System.out.println("Enter the first number:");
a = buf.nextInt();

System.out.println("Enter the second number:");
b = buf.nextInt();

add = a+b;
System.out.println("Sum of the integers is:"  + add);
}
}
