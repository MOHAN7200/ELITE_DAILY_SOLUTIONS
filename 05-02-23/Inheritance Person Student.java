//Inheritance Person Student


import java.io.*;
import java.util.*;
class Person{
    protected String firstname,secondname;
    public void Person(String firstname,String secondname){
        this.firstname=firstname;
        this.secondname=secondname;
    }
}
class Student extends Person{
    private int stid;
    private List<Integer>marks;
    public Student(String firstname,String secondname,int stid){
        super.Person(firstname,secondname);
        this.stid=stid;
        marks=new ArrayList<Integer>();
    }
    public void details(){
        System.out.println("Name:"+" "+secondname+", "+firstname);
        System.out.println("ID:"+" "+stid);
    }
    public void mark(int mar){
        marks.add(mar);
    }
    public void calculate(int n){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=marks.get(i);
        sum=sum/n;
        if(sum>=90 && sum<=100)
            System.out.println("Grade: O");
        else if(sum>=80 && sum<=90)
              System.out.println("Grade: E");
        else if(sum>=70 && sum<=80) 
            System.out.println("Grade: A");
        else if(sum>=55 && sum<=70) 
            System.out.println("Grade: P");
        else if(sum>=40 && sum<=55) 
            System.out.println("Grade: D");
        else
            System.out.println("Grade: T");
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] list=input.nextLine().split(" ");
        Student s=new Student(list[0],list[1],Integer.parseInt(list[2]));
        s.details();
        int n=input.nextInt();
        for(int i=0;i<n;i++)
            s.mark(input.nextInt());
        s.calculate(n);
            
        
    }
}