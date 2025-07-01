package Implements;

interface Shape {
    double area();
    
}
class Circle implements Shape{
    double radius=5;

    public double area(){
        return Math.PI*radius*radius;
    }

}

class ShapeDriver{
    public static void main(String[] args){
        Shape c=new Circle();
        System.out.println("Area : "+c.area());

    }
}
