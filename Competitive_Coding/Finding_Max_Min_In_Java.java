import java.util.Scanner;

public class Finding_Max_Min_In_Java {
    public static void main(String[]args){
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
        int []result=retMax_Min(arr);

            System.out.println("Minimum Element is : "+result[0]);
            System.out.println("Maximum Element is : "+result[1]);


    }


    public static int []retMax_Min(int []arr){
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            else if (arr[i]<min){
                min=arr[i];
            }
        }
        return new int[]{min,max};

    }
}
