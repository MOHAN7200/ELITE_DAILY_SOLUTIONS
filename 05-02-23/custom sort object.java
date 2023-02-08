//custom sort object




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Candidate {
    private String name;
    private int mark;
    public Candidate(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    public String getName(){
        return name;
    }
    public int getMark(){
        return mark;
    }
}
class CompByMark implements Comparator<Candidate>{
    public int compare(Candidate first,Candidate second){
        return first.getMark()-second.getMark();
    }
}
public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Candidate>  students = new ArrayList<Candidate>();
        for(int i=0;i<n;i++){
           String name = in.next();
           int marks = in.nextInt();
           students.add(new Candidate(name,marks));
        }
        Collections.sort(students,new CompByMark());
        for(Candidate student : students){
            System.out.println(student.getName()+" "+student.getMark());
        }
    }
}