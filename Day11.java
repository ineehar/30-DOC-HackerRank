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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int m=3,n=3,count=0,total=0,max=-100;
        while(m<=6)
        {
        while(n<=6)
        {
            for(int i=m-3; i<m; i++)
            {
                for(int j=n-3; j<n; j++)
                {
                    count++;
                    if(count!=4 && count!=6)
                    total+=arr[i][j];
                }
            
            }
            if(max<total)
            max=total;
            total=0;   
            count=0;
            n++;
        }
        m++;
        n=3;
        }
        System.out.println(max);
        scanner.close();
    }
}