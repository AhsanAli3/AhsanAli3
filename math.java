import java.util.Scanner;

public class math {
    public static void main(String[] args){
 // System.out.println(Math.PI);
//  System.out.println(Math.E);


// result = Math.pow(2,5); // raise to a power like 2^5
// result = Math.abs(-5); // prints absolute value
// result = Math.sqrt(9); // Square root of 9 
// result = Math.round(3.14); // rounds up or down
// result = Math.ceil(3.14); // rounds up 
// result = Math.floor(3.99); // rounds down only 
// result = Math.max(10,20); // tells you the max
// result = Math.min(10,20); // tells u the min 
// ALWAYS USE THE Math class followed by . and whatever u want like sqrt or max min
// System.out.println(result);

// HYP c = Math.sqrt((a^2 + b^2))

 Scanner scanner = new Scanner(System.in);
// 
// double a;
// double b;
// double c;
// 
// System.out.print("Enter the length of the side A: ");
// 
// a = scanner.nextDouble();
// 
// System.out.print("Enter the length of the side b: ");
// 
// b = scanner.nextDouble();
// 
// c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
// 
// System.out.println("The Hyp (side c) is " + c + " cm" );


// we need to find circumference
// area and volume 

double radius;
double circumference;
double volume;
double area;

System.out.print("Enter the radius: ");

radius = scanner.nextDouble();

circumference = 2 * Math.PI * radius;
System.out.printf("The circumference is: %.1f\n" , circumference);
area = Math.PI * Math.pow(radius,2);
System.out.printf("The area is: %.1f\n" , area);
volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
System.out.printf("The volume is: %.1f" , volume); // %.1f only works with printf







scanner.close();

    }
    
}
