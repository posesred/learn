package javaclass;

//Sanat
//oct14
import java.util.Scanner;
public class day5{
public static void main(String[] args){
System.out.println("What is input?");
// Declarations...
Scanner input = new Scanner(System.in);
System.out.print("What is your name? ");//print stays on the line
String name = input.nextLine();
System.out.println("Hey " + name + " you\'re awesome!!!");
System.out.println("What is your fav sadwich? :");
String sandwich = input.nextLine();
System.out.println(name + "\'s fav sandwich is a " + sandwich);
System.out.print("Pick a number between 1 and 10; ");
double num1 = input.nextDouble();
System.out.println(name + " picked the number " + num1);
System.out.println(num1+num1);
System.out.print("Pick a second num");
double num2 = input.nextDouble();
System.out.println("Num1 is " + num1 + " num2 is " + num2);
System.out.println("Num1 times num2 is " + num1*num2);
System.out.println(num1 + " x " + num2 + " = " +(num1 * num2));

/*
 Scanner methods
 1) .next() => ths captures the first string up to a space
 2) .nextLine() => this captures the whole written string
 3) .nextInt() => captures the next int 
 4) .nextDouble() => captures the next double aka flout
 */
/*
 Task 1 -> 
 Have user enter a number into a new var called num2.
 this variable can accept all number dec included.
 Have the code printot the following.
 NUM1 x NUM2 = num1 * num2 <= where the first displays the vaule second displays the product
 */


input.close();//Dr java users only
} //ends void 
}// ends class
/*
 How can we make our code interactive aka allwed user to input information.
 -> we need to use a build in Object called Scanner...
 1) we need to import the uilt in code. its located in java.util.Scanner
 2) We need to declae the scanner to use it.
 3) Ask the user the user a quesion
 4) use a scanner method and a variable to capture it.
 */
