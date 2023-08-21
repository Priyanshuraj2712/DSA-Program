import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the element of an array");
        for (int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0;i<5;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of all element is: "+sum);
        sum =0;
        for(int i=0;i<5;i=i+2){
            sum = sum + arr[i];
        }
        System.out.println("Sum of altenate element is: "+sum);
        int max1 = arr[0], max2 =0;
        for(int i=0;i<5;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!= max1){
                max2 = arr[i];
            }
        }
        System.out.println("Second highest no is "+max2);
    }
}
