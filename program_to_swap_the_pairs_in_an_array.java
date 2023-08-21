import java.util.Scanner;
public class Swap_pair {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i=i+2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }
    }
}
