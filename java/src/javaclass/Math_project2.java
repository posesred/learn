package javaclass;

//Sanatjon
//Jan 10

import java.util.*;

public class Math_project2{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to the most awesome calculater EVER!!! ");
  System.out.println("Please select one of the following formula: ");
  System.out.println("1 = Cone: ");
  System.out.println("2 = Cylinder: ");
  System.out.println("3 = Rectangular Prism: ");
  System.out.println("4 = Square based pyramid: ");
  System.out.println("5 = Isoseles Triangular formula: ");
  System.out.print("Please make your selection here: ");
  String choice = input.nextLine();
  // Enter logic to use this UI
  if (choice.equals("1") ) {
    System.out.println("Surface area of Cone selected:");
    System.out.println("The formula is:");
    System.out.println("A = pie(r)(r^2sqrt(h^2+r^2))");
    System.out.print("What is the radius? ");
    double r = input.nextDouble();
    System.out.print("What is the height? ");
    double h = input.nextDouble();
    double area = Math.PI * r *(     r+Math.pow(Math.pow(h,2)+Math.pow(r,2),0.5)          );
    System.out.println("The surface area  is "+area);
  }
  else if (choice.equals("2")) {
    System.out.println("CYLINDER - SELECTED");
    System.out.println("The formula is: ");
    System.out.println("A = 2?rh + 2?r^2");

    System.out.print("WHAT IS VALUE OF r: ");
    double r = input.nextDouble();
    System.out.print("WHAT IS VALUE OF h: ");
    double h = input.nextDouble();
    double vol = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
    System.out.println("THE SURFACE AREA IS " + vol);
  }

  else if (choice.equals("3")) {
    System.out.println("RECTANGULAR PRISM - SELECTED");
    System.out.println("The formula is: ");
    System.out.println("A = 2 (wl + hl + hw");

    System.out.print("WHAT IS VALUE OF w: ");
    double w = input.nextDouble();
    System.out.print("WHAT IS VALUE OF l: ");
    double l = input.nextDouble();
    System.out.print("WHAT IS VALUE OF h: ");
    double h = input.nextDouble();
    double vol = (2 * ((w * l) + (h * l) + (h * w)));
    System.out.println("THE SURFACE AREA IS " + vol);
  }
  else if (choice.equals("4")) {
    System.out.println("Square based pyramid selected:");
    System.out.println("The formula is:");
    System.out.println("A = a^2+2asqrt(a^2/4 +h^2");
    System.out.print("What is Base edge? "); double a = input.nextDouble();
    System.out.print("What is Height? "); double h = input.nextDouble();
    double area = Math.pow(a,2)+2 * a * Math.pow((Math.pow(a,2)/4) +Math.pow(h,2)  ,0.5);
    System.out.println("The surface area  is "+area);
   
  }
  else if (choice.equals("5")) {
    System.out.println("Isoseles Triangular selected:");
    System.out.println("The formula is:");
    System.out.println("SA = bh +2la +lb");
    System.out.print("What is the length of equal sides of  the isosceles traingles? "); double a = input.nextDouble();
    System.out.print("What is the base of the isosceles traingles? "); double b = input.nextDouble();
    System.out.print("What is length of the rectangles? "); double l = input.nextDouble();
    System.out.print("What is the height? "); double h = input.nextDouble();
    double area = (b*h)+(2*l*a)+(l*b) ;
    System.out.println("The surface area  is "+area);
   
  }
  
  else {
    System.out.println("ERROR... That option is not available at time time. Try again later");
  }
 
 
  input.close();
}//end main
}//end class