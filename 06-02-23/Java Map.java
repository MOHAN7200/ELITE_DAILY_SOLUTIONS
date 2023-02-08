//Java Map




//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String,Integer>phone= new HashMap<>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone1=in.nextInt();
            phone.put(name,phone1);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phone.containsKey(s)){
                System.out.println(s+"="+phone.get(s));
            }
            else
                System.out.println("Not found");
        }
        
      
        
    }

}
