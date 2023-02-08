//Shape Hierarchy Interfaces



import java.io.*;
import java.util.*;
interface Shape{
    double area();
    double perimeter();
}
class Rectangle implements Shape{
    private double l;
    private double b;
    Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
}
class Square implements Shape{
    private double side;
    Square(double side){
        this.side = side;
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}
class Circle implements Shape{
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return (22.0/7)*(radius*radius);
    }
    public double perimeter(){
        return 2*(22.0/7)*radius;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=0;i<n;i++){
            String[] str = in.nextLine().split(" ");
            if(str[0].equals("C")){
                Circle c = new Circle(Integer.parseInt(str[1]));
                System.out.printf("%.2f",c.area());
                System.out.print(" ");
                System.out.printf("%.2f",c.perimeter());
                System.out.println(" ");
            }
            else if(str[0].equals("R")){
                Rectangle c = new Rectangle(Integer.parseInt(str[1]),Integer.parseInt(str[2]));
                System.out.printf("%.2f",c.area());
                System.out.print(" ");
                System.out.printf("%.2f",c.perimeter());
                System.out.println(" ");
            }
            else if(str[0].equals("S")){
                Square c = new Square(Integer.parseInt(str[1]));
                System.out.printf("%.2f",c.area());
                System.out.print(" ");
                System.out.printf("%.2f",c.perimeter());
                System.out.println(" ");
            } 
        }
    }
}