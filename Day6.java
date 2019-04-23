import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main (String[] args) throws IOException
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str; int t;
        t=Integer.parseInt(br.readLine());
        while(t!=0)
        {
        str= br.readLine();
        int n=str.length();
        for(int i=0; i<n; i+=2)
        {
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");
        for(int j=1; j<n; j+=2)
        {
           System.out.print(str.charAt(j));
        }
        System.out.println();
        t--;
        }
    }
}

