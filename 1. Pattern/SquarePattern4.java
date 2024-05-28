import java.util.Scanner;

public class SquarePattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n-j+1); //row 1 : n-j+1 : 5 - 1 + 1 --> 5 
            }
            System.out.println();
        }
        sc.close();
    }
}
