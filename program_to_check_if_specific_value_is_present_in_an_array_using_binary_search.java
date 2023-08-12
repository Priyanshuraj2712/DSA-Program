import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No.of elements of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. to search");
        int search = sc.nextInt();
        int low=0, high= n-1;
        int mid = (high+low)/2;
        int check = 0;
        while(low<=high){
            if(search>arr[mid]){
                low = mid+1;
                mid = (low+high)/2;
            }
            else if(search<arr[mid]){
                high = mid-1;
                mid = (low+high)/2;
            }
            else if(search==arr[mid]){
                System.out.println("location is: "+(mid+1));
                System.out.println("No. found");
                check = 1;
                break;
            }
        }
        if(check==0){
            System.out.println("No. not found");
        }
    }
}
