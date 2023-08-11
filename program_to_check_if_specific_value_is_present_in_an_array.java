import java.util.*;
public class Linear {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("No. of elements");
      int n = sc.nextInt();
      System.out.println("Enter the elements of array");
      int arr[] = new int[n]; 
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      } 
      System.out.println("Enter the no. to search");
      int search = sc.nextInt();
      for(int i=0;i<n;i++){
        if(arr[i]==search){
            System.out.println("Location of the no is: "+(i+1));
            System.out.println("Index is: "+i);
            break;
        }
        else if(i==n-1){
            System.out.println("No. not found");
        }
      }
    }
}
