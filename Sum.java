import java.util.*;
class Sum{
public static void main(String[] args){
int a,b,c,product;

Scanner buf = new Scanner(System.in);
System.out.println("Enter the first number:");
a = buf.nextInt();

System.out.println("Enter the second number:");
b = buf.nextInt();

System.out.println("Enter the third number:");
c = buf.nextInt();



product = a*b*c;
System.out.println("Product of the integers is:"  + product);
}
}
