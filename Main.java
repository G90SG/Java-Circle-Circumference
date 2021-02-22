// Importing Java scanner which allows the program to take accept input data from the user_input
import java.util.Scanner;
// Creating Main Class
class Main {
  public static void main(String[] args) {
// Declaring the variable radius as a 'float' 
    float radius;
// Declaring the variable area and circum as a 'double'
    double area,circum; 
// Using System.out.print to ask the user to enter the radius    
    System.out.print("Enter Radius: ");
// Calling the 'Scanner' class to accept user input
    Scanner user_input = new Scanner(System.in);
// Allocating the input to the 'radius' variuable
    radius = user_input.nextFloat();
// Creating calculations 
    area = 3.14 * radius * radius;
    circum = 3.14 * 2 * radius;
// Area = pi r2 and Circum = 2 pi r 
// Print functions to return the outcome to the user
    System.out.print("\nArea of Circle is: " + area);
    System.out.print("\nCircumference of Circle is: " + circum);
  
  }
}