import java.util.*;
class Sum{
public static void main(String[] args){
int a,b,c,d,add;

Scanner buf = new Scanner(System.in);
System.out.println("Enter the first number:");
a = buf.nextInt();

System.out.println("Enter the second number:");
b = buf.nextInt();

System.out.println("Enter the third number:");
c = buf.nextInt();

System.out.println("Enter the fourth number:");
d = buf.nextInt();

add = a+b+c+d;
System.out.println("Sum of the integers is:"  + add);
}
}
