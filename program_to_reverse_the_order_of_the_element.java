import java.util.Scanner;
public class Reversing {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of an array");
       int n = sc.nextInt();
       System.out.println("Enter the elements of an array");
       int arr[] = new int[n]; 
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }
       System.out.println("After Reversing:");
       for(int i=n-1;i>=0;i--){
        System.out.println(arr[i]);
        }   
    }
}
