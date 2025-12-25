import java.util.Scanner;

public class ifstmnt {
  public static void main(String[] args) {

    /*if statement = performs a block of code. if
     its condition is true */ 

     Scanner scanner = new Scanner(System.in);


     int age;
     String name;
     boolean isStudent;

     System.out.println("Enter your name: ");
     name = scanner.nextLine();

     System.out.print("Please enter your age: ");
     age = scanner.nextInt();

     System.out.println("Are you a student (true/false): ");
     isStudent = scanner.nextBoolean();
     //GROUP 1
   if(name.isEmpty()){   //.isEmpty() gives you boolean t or f 

      System.out.println("You didnt enter your name");

   }

   else {
System.out.println("Hello " + name);

   }
     
   //GROUP 2

     if(age >= 65){
        System.out.println("You are an Senior");
     }

     else if(age < 0){
        System.out.println("You have not been born ");
     }

     else if(age == 0){
        System.out.println("Your age is invalid");
     }
     
     else if(age>=18){
        System.out.println("You are an adult ");
     }
     else{
        System.out.println("You are to young");

     }

     //Group 3

     if(isStudent){

      System.out.println("You are a student!");
     }

     else{
     System.out.println("You are not a student");

     }

     scanner.close();
     

  }


}
    

