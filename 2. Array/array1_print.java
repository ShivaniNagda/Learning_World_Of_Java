/* prompts the user to enter a size for an array and then fills the array with integer inputs provided by the user, identify and fix any issues in the code. Your task is to ensure that the program works correctly according to the given specifications:
The program should prompt the user to enter the size of the array.
The program should accept integer elements to populate the array.
The program should print each element of the array as it is entered.
After all elements have been entered, the program should print the first element of the array.
 */


 import java.util.Scanner;

 class array1_print {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         // Prompt the user to enter the size of the array
         System.out.println("Enter the size of the array: ");
         int n = input.nextInt();
 
         // Initialize the array with the given size
         int[] arr = new int[n];
 
         // Read elements of the array from the user
         System.out.println("Enter " + n + " elements:");
         for (int i = 0; i < n; i++) { // Changed 'i <= n' to 'i < n' to avoid ArrayIndexOutOfBoundsException
             arr[i] = input.nextInt();
             System.out.println(arr[i]); // Print each element as it is entered
         }
 
         // Print the first element of the array
         System.out.println("The first element is: " + arr[0]);
 
         // Close the scanner
         input.close();
     }
 }
 