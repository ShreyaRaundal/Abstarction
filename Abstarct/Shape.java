package Abstarct;

abstract class Shape {
    abstract double area();

    void  message(){
        System.out.println("Calculate the Area...");
    } 
}

class Circle extends Shape{
    double radius=5;

    double area(){
        return Math.PI*radius*radius;
    }
}

class ShapeDriver{
    public static void main(String[]args){
        Shape c=new Circle();
        c.message();
        System.out.println("Area : "+c.area());
    }
}
