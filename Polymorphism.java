
import java.util.Scanner;

  class Shape 
 { 
   void draw() 
   { 
    System.out.println("draw shape"); 
   } 
    void erase() 
    { 
     System.out.println("erase shape"); 
    } 
 
} 
 
class Square extends Shape { 
 
 void draw()
  { 
 System.out.println(" It's square area:"); 
  } 
 
 double area()
 {
	 double side;
	 Scanner sc=new Scanner(System.in); 
     System.out.println("enter side");
	 side=sc.nextDouble(); 
     double squareArea= side*side; 
// System.out.println ("Area of square = "+squareArea); 
 return squareArea;
 } 
} 
 
class Triangle extends Shape 
{ 
 void draw() 
 { 
 System.out.println("It's Triangle area:"); 
 } 
 
 double area() { 
	 System.out.println("enter base"); 
	 Scanner sc=new Scanner(System.in); 
	double  base=sc.nextDouble(); 
	 System.out.println("enter height"); 
	double height=sc.nextDouble(); 
 
 double triangleArea= (base*height)/2; 
 //System.out.println ("Area of Triangle = "+triangleArea); 
 return triangleArea;
 } 
} 
class Circle extends Shape 
{ 
 void draw() 
 { 
 System.out.println("It's circle area:"); 
 } 
 
 double area() 
 { 
 double pi = 3.14;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter radius of circle:");
 double r=sc.nextDouble() ;
 double circleArea=pi*r*r; 
 //System.out.println ("Area of circle = "+circleArea); 
 return circleArea;
 } 
} 
 
public class Polymorphism
{ 
public static void main(String[] args) { 
 Shape S1= new Square(); 
 Square s=new Square();
 S1.draw(); 
 System.out.println("area of square is:"+s.area());
 //S1.erase(); 
 

 Shape S2= new Triangle(); 
 Triangle t=new Triangle();
 S2.draw();
 System.out.println("area of triangle is:"+t.area()); 
 //S2.erase(); 
 
 Shape S3 =new Circle(); 
 Circle c=new Circle();
 S3.draw(); 
 System.out.println("area of circle is:"+c.area());
 //S3.erase(); 
 } 
} 
