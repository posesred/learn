package javaclass;

//nov 29
import java.util.*;
public class Day26{
public static void main(String[] args){
//Declarations
Scanner x = new Scanner(System.in);

System.out.println("What is the ideal temp for vocaion is ");
int temp = x.nextInt();

if(temp>=110 || temp<0){
System.out.println("These conditions are not suitable for vocation ");
}

else if(temp>=95){
System.out.println("Aruba ");
}

else if(temp<95 && temp>=80){//80-95
System.out.println("Vegas ");
}

else if(temp<80 && temp>50){ // 50-80
System.out.println("NYC ");
}

else if(temp<50 && temp>35){ //35-50
System.out.println("sking ");
}

else if(temp<=35){
System.out.println("Alaska "); 
}



} // end void
} // end class

