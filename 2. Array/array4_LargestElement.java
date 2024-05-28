// Find Largest Element in array;

import java.util.Scanner;
public class array4_LargestElement {
    
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt(); // size of array
        int inputArr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int input = 0; input < size; input++) {
            inputArr[input] = sc.nextInt();
        }
        sc.close(); // Close the scanner
        return inputArr;
    }

    public static int largestElement(int inputArr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < inputArr.length; i++) {
            if(inputArr[i] > max) {
                max = inputArr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int input[] = takeInput();
        int largest = array4_LargestElement.largestElement(input);
        System.out.println("The largest element is: " + largest);
    }
}
