import java.util.Scanner;
public class Segregate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = 0, b = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                a++;
            }
            else if(arr[i]==1){
                b++;
            }
        }
        for(int i=0;i<n;i++){
            if(a!=0){
                arr[i]=0;
                a--;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println("After segregation:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
