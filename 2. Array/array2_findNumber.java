/* 
Write a Java program that performs the following tasks:
Prompts the user to enter the size of an array.
Accepts integer elements from the user to populate the array.
Prompts the user to enter a number to search within the array.
Searches for the given number in the array and:
Prints the index of the first occurrence of the number if it is found.
Prints a message indicating the number is not found if it does not exist in the array.
Ensures that the program only prints the "not found" message once, even if the number is not found in any of the array elements.
*/
import java.util.Scanner;
public class array2_findNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        // Initialize the array
        int[] arr = new int[size];

        // Read the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Read the number to find
        System.out.println("Enter the number to find: ");
        int number = input.nextInt();

        // Initialize a flag to check if the number is found
        boolean isFound = false;

        // Search for the number in the array
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                System.out.println("The number " + number + " is found at index: " + i);
                isFound = true;
                break;
            }
        }

        // If the number is not found
        if (!isFound) {
            System.out.println("The number " + number + " is not found in the array.");
        }

        // Close the scanner
        input.close();
    }
}
