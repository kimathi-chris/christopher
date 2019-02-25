import java.util.*;
class Sum{
public static void main(String[] args){
int a,b,c,d,product;

Scanner buf = new Scanner(System.in);
System.out.println("Enter the first number:");
a = buf.nextInt();

System.out.println("Enter the second number:");
b = buf.nextInt();

System.out.println("Enter the third number:");
c = buf.nextInt();

System.out.println("Enter the fourth number:");
d = buf.nextInt();



product = a*b*c*d;
System.out.println("Product of the integers is:"  + product);
}
}
