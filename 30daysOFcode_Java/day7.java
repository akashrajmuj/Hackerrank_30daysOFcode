import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        
        int i,j;
        for(i=0,j=n-1;i<j;i++,j--)
        {
            arr[i]=arr[i]+arr[j];  // swap 2 variables without use of a temp variable
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            
        }
        
        for(int k:arr)  //for each loop
            System.out.print(k+" ");
        
        
        
        scanner.close();
    }
}
