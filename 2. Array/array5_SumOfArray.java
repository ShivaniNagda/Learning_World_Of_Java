/*
Problem statement
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the sum of the numbers in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60
*/

// ---------------------------------------- Solution----------------------------
/*
import java.util.Scanner;
public class array5 {
    
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt(); // size of array
        int input[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int inputt = 0; inputt < size; inputt++) {
            input[inputt] = sc.nextInt();
        }
        sc.close(); // Close the scanner
        return input;
    }
    public static int sum(int input[]){
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum += input[i] ;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter iteration time : ");
        int t = sc.nextInt();
        
        while (t>0) {
            int input[] = takeInput();
             int arr = sum(input);
            System.out.println("The sum of array element is: " + arr);
        } 
        sc.close();
        t--;
    }
}
 */

// ---------------------------------------- Solution 2----------------------------
import java.util.Scanner;

public class array5_SumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        System.out.println("Enter test case number : ");
        int t = sc.nextInt();
        
        // Loop through each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Read the size of the array
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            
            // Initialize the sum variable
            int sum = 0;
            
            // Read the array elements and compute the sum
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the element " + (i + 1) + ": ");
                int element = sc.nextInt();
                sum += element;
            }
            
            // Print the sum of the array for this test case
            System.out.println(sum);
        }
        
        sc.close();
    }
}
