import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

int n=scan.nextInt();
double a=scan.nextDouble();
String str=scan.next();
str=str+scan.nextLine();
System.out.println(i+n);
System.out.println(d+a);
System.out.println(s+str);
        scan.close();