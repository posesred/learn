package javaclass;

//sanatjon
//nov 24
import java.util.*;
public class Day25{
public static void main(String[] args){
//Declarations
Scanner x = new Scanner(System.in);
System.out.println("Enter a food ");
String food1 = x.nextLine();
System.out.println("Enter another food ");
String food2 = x.nextLine();
int food1l = food1.length();
int food2l = food2.length();
boolean f1g = food1l>food2l;
boolean f2g = food2l>food1l;

System.out.println("Foods entered " + food1 + " " + food2);
if(f1g){
System.out.println(food1 + " is longer than " + food2); 
}//ends if 
else if(f2g){
System.out.println(food2 + " is longer than " + food1);
}//ends else if 
else{
System.out.println(food1 + " " + food2 +"They have the same amount of letters");
} //else

if(food1.toLowerCase().charAt(0) < food2.toLowerCase().charAt(0) ){
 System.out.println(food1 + " goes before " + food2); 
}
else if(food2.toLowerCase().charAt(0) < food1.toLowerCase().charAt(0) ){
 System.out.println(food2 + " goes before " + food1); 
}
else{
 System.out.println(food1 + " and " + food2 + " both start with the same letters "); 
}
//if food1 is both shorter and alphabetically first 1
//longer  and aplha first 2
//short and aplha last 3
//longer and last 4
//equal and equal 5 
//equal and first 6 
//equal and last 7 
//short and same 8 
//long and same 9 
                   
                   
}//ends void
}//ends class