//remove duplicates 12



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input  = str.next();
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(int i=0;i<input.length();i++){
            char p=input.charAt(i);
        if(!set.contains(p))
            set.add(p);
        }
        for(Character p:set)
            System.out.print(p);
    }
}


