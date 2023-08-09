import java.util.Scanner;
public class Second_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i=-0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max1 = arr[0], max2 =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!= max1){
                max2 = arr[i];
            }
        }
        System.out.println("Second highest no is ");
        System.out.println(max2);
    }
}
