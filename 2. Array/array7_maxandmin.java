import java.util.Scanner;
public class array7_maxandmin {
    public static int[] takeinput(Scanner sc){
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }
        return arr;
    }
    public static void minmax(int arr[]){
        int max =arr[0];
        int min = arr[0];
        System.out.println("The value of max is : " + max + "The value of min is : " + min);
        for(int i=1 ; i<=arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
               min = arr[i];
            }
            
        }System.out.println("The value of max is : " + max + " The value of min is : " + min);
    }

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter test Case : ");
    int t = sc.nextInt();
    while (t > 0) {
    int newarr[] = takeinput(sc);
    System.out.println(newarr);
    minmax(newarr);
    }
    sc.close();
}

}