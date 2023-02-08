//Class and objects 9




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Person{
    private int age;
    public Person(int initialage){
        if(initialage<0){
            initialage=0;
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            age=initialage;
        }
    }
    public void amIold(){
        if(age<13){
            System.out.println("You are young.");
        }else if(age >= 13 && age < 18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
    }
    public void yearPasses(){
        age+=1;
    }  
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIold();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIold();
            System.out.println();
        }
        sc.close();
    }
}