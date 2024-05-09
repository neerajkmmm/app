// import java.util.Scanner;

// class Neeraj{
//     public static void main(String[]args){
//         Scanner object = new Scanner(System.in);
//         System.out.print("hello");
//     }
// }


import java.util.*;
class Age4{
public static void main(String[]args){
Scanner ob=new Scanner(System.in);
System.out.print("Enter 1st age: ");
int age1=ob.nextInt();
System.out.print("Enter 2nd age:");
int age2=ob.nextInt();
System.out.print("Enter 3rd age:");
int age3=ob.nextInt();
   if(age1>age2){
	   if(age1>age3){
		 System.out.println("1st age is Greater");
	   }
   }
   if(age2>age1){
	   if(age2>age3){
		 System.out.println("2nd age is Greater");
	   }
   } 
   if(age3>age1){
	   if(age3>age2){
		System.out.println("3rd age is Greater");
	   }
   }
}
}
