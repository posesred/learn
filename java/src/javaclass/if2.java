package javaclass;

//nov10
import java.util.*;
public class if2{
public static void main(String[] args){
// declaration
Scanner x = new Scanner(System.in);


System.out.println("What is the current temperature; ");
double temp = x.nextInt();
System.out.println(temp);
if(temp>=80) {
  System.out.println("ITS TOO HOT"); 
}
if(temp<=30) {
  System.out.println("ITS TOO COLD"); 
}
if(temp==65) {
  System.out.println("ITS THE PERFECT WEATHER"); 
}

}
}