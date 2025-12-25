import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        // Calculate the area of a rectangle

        double width;
        double height;
        double area;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the width: ");

        width = scanner.nextDouble();

        System.out.println("Enter the height: ");

        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of the rectangle is: " + area + " cm");

        scanner.close();


        
}

}

