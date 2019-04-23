//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> dict= new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dict.get(s)!=null)
            System.out.println(s+"="+dict.get(s));
            else
            System.out.println("Not found");
        }
        in.close();
    }
}

