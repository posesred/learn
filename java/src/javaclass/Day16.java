package javaclass;

//nov 3
import java.util.*;
import java.text.DecimalFormat;
public class Day16 {
public static void main(String[] args){
  //declarations 
  Scanner x = new Scanner(System.in);
  DecimalFormat m = new DecimalFormat("$#,###.00");
  double w,r,g,b,p,t;
  System.out.println("How many white chips do you have? ");
  w = x.nextDouble();
  System.out.println("How many red chips do you have? ");
  r = x.nextDouble();
  System.out.println("How many green chips do you have? ");
  g = x.nextDouble();
  System.out.println("How many black chips do you have? ");
  b = x.nextDouble();
  System.out.println("How many purple chips do you have? ");
  p = x.nextDouble();
  t = w+r+g+b+p;
  System.out.println("You are going to be payed " + m.format(t));
  
}
}