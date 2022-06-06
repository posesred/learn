package javaclass;

import java.util.*;
public class Day12{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  // POWERSSSS
  System.out.println("Please enter a number: ");
  int num = input.nextInt();
  System.out.println("please enter the exponent to raies the number to: ");
  int exp = input.nextInt();
  System.out.println(num+" raised to the "+exp+" is "+(Math.pow(num,exp)));
  //System.out.println("The square root of " +num+ " is "+Math.sqrt(num));
  //Java has a build in Object called math
  //Math.pow(base ,exponent ) => 
  //Math.sqrt(num) -> finds the square root of a number!
  //Math.PI);
  
  
  // ROooOTS 
  System.out.println("Please enter a number: ");
  int num2 = input.nextInt();
  System.out.println("Please enter the root to find: ");
  int root = input.nextInt();
  System.out.println(num2+" to the " + root +" root is " + (Math.pow(num2,(1.0/root)))   );
  
  System.out.println(" Enter the dam radius of the circle ");
  double radius = input.nextDouble();
  double area = Math.PI * Math.pow(radius,2);
  double circle = Math.PI * 2 * radius;
  System.out.println("The area is " + area + " and the Circumference is " + circle);
  
  
  
  input.close();
  }
}
