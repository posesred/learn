package javaclass;

//nov 17
import java.util.*;
import java.text.DecimalFormat;
public class Day23{
public static void main(String[] args){
//Declarations
Scanner x = new Scanner(System.in);
DecimalFormat m = new DecimalFormat("###.0");

System.out.println("What did you get on test 1 " );
double grade1 = x.nextDouble();
System.out.println("What did you get on test 2 " );
double grade2 = x.nextDouble();
System.out.println("What did you get on test 3 " );
double grade3 = x.nextDouble();
System.out.println("What did you get on test 4 " );
double grade4 = x.nextDouble();
System.out.println("What did you get on test 5 " );
double grade5 = x.nextDouble();
System.out.println("What did you get on test 6 " );
double grade6 = x.nextDouble();
System.out.println("Grade 1" +grade1);
System.out.println("Grade 2" +grade2);
System.out.println("Grade 3" +grade3);
System.out.println("Grade 4" +grade4);
System.out.println("Grade 5" +grade5);
System.out.println("Grade 6" +grade6);
Double agrade = (grade1+grade2+grade3+grade4+grade5+grade6);
System.out.println("Your test average is " +m.format(agrade));





if (agrade>90){
System.out.println(" You got a 4.0 " );
}

else if(agrade>80){
System.out.println(" You got a 3.0 " );
}


else if(agrade>70){
System.out.println(" You got a 2.0 " ); 
}
 // goes in order 
  // 

else if (agrade>65){
System.out.println(" You got a 1.0 " );
}

else{System.out.println(" You got a F " );  
}

// else if is used to connectt ifs together 
}
}
