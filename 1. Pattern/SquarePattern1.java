import java.util.Scanner;

public class SquarePattern1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter the number : ");
    for (int i=1;i<=n;i++) {
        for (int j=1;j<=n;j++) {
            System.out.print("* ");   
        }
        System.out.println(); 
        }    
 
     sc.close();
    //  System.out.println("Scanner closed"); 
}
}