import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns:");
        int n = sc.nextInt();
        for (char i = 1; i <= n; i++) {
            for (char j = 1; j <= i
            ; j++) {
                System.out.print((char)(i + 64)); 
                
            }
            System.out.println();
        }
        sc.close();
    }
}
