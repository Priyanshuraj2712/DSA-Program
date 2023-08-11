import java.util.Scanner;
public class Even_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements at even index are: ");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd Elements are: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println("First and last elements are: ");
        System.out.println(arr[0]+"\t"+arr[n-1]);
    }
}
