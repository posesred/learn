package javaclass;

//Sanatjon
//Jan 5

import java.util.*;

public class Day13_math {
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to the most awesome calculater EVER!!! ");
  System.out.println("Please select one of the following formula: ");
  System.out.println("1 = Volume of a Cylinder: ");
  System.out.println("2 = Pythagorean Theorem: ");
  System.out.println("3 = Quadratic Equation: ");
  System.out.println("4 = Distance formula: ");
  System.out.println("5 = Slope formula: ");
  System.out.println("6 = Volume of a Sphere: ");
  System.out.println("7 = Exponental growth: ");
  System.out.print("Please make your selection here: ");
  String choice = input.nextLine();
  // Enter logic to use this UI
  if (choice.equals("1") ) {
    System.out.println("Volume of Cylinder selected:");
    System.out.println("The formula is:");
    System.out.println("V = pi * r^2 * h");
    System.out.print("What is the radius? ");
    double r = input.nextDouble();
    System.out.print("What is the height? ");
    double h = input.nextDouble();
    double vol = Math.PI * Math.pow(r,2) * h;
    System.out.println("The volume is "+vol);
  }
  else if (choice.equals("2")) {
    System.out.println("Pythagorean Theorem selected:");
    System.out.println("The formula is:");
    System.out.println("a^2 + b^2 = c^2");//c = sqrt(a^2 + b^2)
    System.out.print("What is a? "); double a = input.nextDouble();
    System.out.print("What is b? "); double b = input.nextDouble();
    double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) );
    System.out.println("The value of c is "+c);
  }
  else if (choice.equals("3")) {
    System.out.println("Quadratic Equation selected:");
    System.out.println("The formula is:");
    System.out.println("x = (-b +- sqrt(b^2 - 4ac) )/(2a)");//y = x^2 + x - 6
    System.out.print("What is a? "); double a = input.nextDouble();
    System.out.print("What is b? "); double b = input.nextDouble();
    System.out.print("What is c? "); double c = input.nextDouble();
    double xPlus = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c ) )/(2 * a);
    double xSub = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c ) )/(2 * a);
    System.out.println("x = "+xPlus+" and x = "+xSub);
   
  }
  else if (choice.equals("4")) {
    System.out.println("Distance formula selected:");
    System.out.println("The formula is:");
    System.out.println("d = sqrt((x2-x1)^2+(y2-y1)^2)");
    System.out.print("What is x1? "); double x1 = input.nextDouble();
    System.out.print("What is x2? "); double x2 = input.nextDouble();
    System.out.print("What is y1? "); double y1 = input.nextDouble();
    System.out.print("What is y2? "); double y2 = input.nextDouble();
    double d = Math.sqrt(Math.pow((x1-x2),2)+Math.pow(y1-y2,2));
    System.out.println("distance = " +d );
   
  }
  else if (choice.equals("5")) {
    System.out.println("Distance formula selected:");
    System.out.println("The formula is:");
    System.out.println("m = sqrt((y1-y2)/(x1-x2))");
    System.out.print("What is x1? "); double x1 = input.nextDouble();
    System.out.print("What is x2? "); double x2 = input.nextDouble();
    System.out.print("What is y1? "); double y1 = input.nextDouble();
    System.out.print("What is y2? "); double y2 = input.nextDouble();
    double m = (y1-y2)/(x1-x2);
    System.out.println("m = "+m);
   
  }
  else if (choice.equals("6")) {
    System.out.println("Volume of Sphere selected:");
    System.out.println("The formula is:");
    System.out.println("V = 4/3(pie)(r^3)");
    System.out.print("What is radius? "); double r = input.nextDouble();
    double vol = Math.PI * Math.pow(r,3) * (4.0/3);
    System.out.println("distance = " +vol );
  }
  else if (choice.equals("7")) {
    System.out.println("Exponental Growth selected:");
    System.out.println("The formula is:");
    System.out.println("f(x) = a(1+r)^x");
    System.out.print("What is the intial amount? "); double a = input.nextDouble();
    System.out.print("What is the rate(percents so dont forget to divide by 100)? "); double r = input.nextDouble();
    System.out.print("How long is the term? "); double x = input.nextDouble();
    double fx = a*Math.pow((1+r),x);
    System.out.println("m = "+fx);
   
  }
  else {
    System.out.println("ERROR... That option is not available at time time. Try again later");
  }
 
 
  input.close();
}//end main
}//end class
