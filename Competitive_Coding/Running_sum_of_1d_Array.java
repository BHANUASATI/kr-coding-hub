import java.util.Scanner;

public class Running_sum_of_1d_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the Array Element :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position " + i + ": ");
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        int []res=runningSum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] runningSum(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            arr[i]=sum;
        }
        return arr;
    }

}
