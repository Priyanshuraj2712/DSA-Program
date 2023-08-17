import java.util.Scanner;
public class Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    System.out.println("Enter the element of an array");
    int arr[] = new int[n+1];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the index to add the element:");
    int a = sc.nextInt();
    System.out.print("Enter the element to add: ");
    int b = sc.nextInt();
    for(int i=n-1;i>=a;i--){
        arr[i+1] = arr[i];
    }
    arr[a] = b;
    for(int i=0;i<n+1;i++){
        System.out.println(arr[i]);
        }
    }
}
