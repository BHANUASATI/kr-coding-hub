import java.util.Scanner;

public class Reversing_The_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the Array Element :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position " + i + ": ");
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        int []result=reverse(arr);
        for (int j : result) {
            System.out.println(j);
        }

    }




    //Reverse a Array
    public static int [] reverse(int []arr){
       int i=0;
       int j=arr.length-1;
       while(i<j){
           int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        return arr;



    }

}
