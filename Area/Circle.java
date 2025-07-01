package Area;

class Circle implements Shape{
    double radius = 5;
    public double area() {
        return Math.PI * radius * radius;
    }
}
