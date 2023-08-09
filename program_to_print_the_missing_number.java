import java.util.Scanner;
public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the elments of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing elements are: ");
        for(int i=1;i<=n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }
            }
            if(count<1){
                System.out.println(i);
            }
        }
    }
}
