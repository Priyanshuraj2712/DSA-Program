import java.util.Arrays;
import java.util.Scanner;
public class find_median{
        public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the size of an array");
              int n = sc.nextInt();
              System.out.println("Enter the element of an array");
              int arr[] = new int[n];
              for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
              }  
               median (arr , n);
        }
        public static void median(int arr[], int n ){
                Arrays.sort(arr);
                int s = n/2;
                System.out.println("Median is:"+arr[s]);
        }
}
