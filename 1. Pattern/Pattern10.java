import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns:");
        int n = sc.nextInt();
        int j = 1;
        
        for (int i = 1; i <= n; i++) {
          
            for ( j = 1; j <= n-i; j++) {
                System.out.print(j); 
            }
            for (int k = 1; k <=j-1; k++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
        sc.close();
    }
}
