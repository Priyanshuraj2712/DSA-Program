import java.util.Scanner;
public class Removing {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    System.out.println("Enter the element of an array");
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to remove");
    int a = sc.nextInt();
    int count = 0;
    for(int i=0;i<n;i++){
        if(arr[i] == a){
            count++;
            for(int j=i;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            i--;
        }
    }
    System.out.println("After removing of element");
    for(int i=0;i<n-count;i++){
        System.out.println(arr[i]);
        }
    }
}
