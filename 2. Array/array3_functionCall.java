/*
 * takeinput: This method is responsible for reading the size of the array and its elements from the user. It then returns the populated array.
print: This method prints each element of the array passed to it.
main: This method serves as the entry point of the program. It calls takeinput to get the array and then calls print to display the array elements.
 */



import java.util.Scanner;

public class array3_functionCall {
    
    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt(); // size of array
        int inputarr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int input = 0; input < size; input++) {
            inputarr[input] = sc.nextInt();
        }
        sc.close(); // Close the scanner
        return inputarr;
    }

    public static void print(int inputarr[]) {
        for(int i = 0; i < inputarr.length; i++) {
            System.out.println(inputarr[i]);
        }
    }

    public static void main(String[] args) {
        int input[] = takeinput();
        print(input);
    }
}
