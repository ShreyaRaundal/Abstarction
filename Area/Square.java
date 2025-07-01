package Area;

public class Square implements Shape {
    double side=4;
    @Override
      public double area() {
        return side * side;
        
    }
}
