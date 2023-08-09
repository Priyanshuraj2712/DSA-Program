import java.util.Scanner;
public class Swap{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    System.out.println("Enter the elements of an array");
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
    int temp = arr[0];
    arr[0] = arr[n-1];
    arr[n-1] = temp;
    System.out.println("After swapping:");
    for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }   
}
