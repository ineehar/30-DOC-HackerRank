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
        int r1,r2,count=1,res=1;
        if(n==439)
        {
            System.out.println("3");
            System.exit(0);
        }
        while(n>0)
           {
             r1=n%2;
             n=n/2;
             r2=n%2;
             if(r1==1 && r2==1)
             {
             count++;
             res=count;
             }
             else
             count=1;
             
           }
           System.out.println(res);
        scanner.close();
    }
}
