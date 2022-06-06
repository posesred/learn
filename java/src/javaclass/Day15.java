package javaclass;

import java.util.*;
public class Day15{
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  System.out.println("How much money do you spend weekly: ");
  double week = input.nextDouble();
  double month=week*4;
  System.out.println("This is how much you spend a month $" + month);
  }
}