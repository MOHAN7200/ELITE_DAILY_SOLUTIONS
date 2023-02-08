//Custom Integer List




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class IntegerList{
    private int[] list;
    private int elementindex;
    private int size;
    public IntegerList(int size){
        this.size=size;
        list=new int[size];
        this.elementindex=0;
        
    }
    public void add(int value){
        if(elementindex<size){
            list[elementindex]=value;
            elementindex=elementindex+1;
            
        
        }
        else{
            System.out.println("can't add, list is full");
            
            
        }
    }
    public void display(){
        
        
        for(int i=0;i<size;i++){
            System.out.println(i+" : "+list[i]);
            
        }
        
        
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        nums.display();
        

    }
}