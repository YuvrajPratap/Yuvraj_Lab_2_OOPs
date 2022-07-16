public class Circle implements IShape{
    int radius;
    String color;
    final double PI = 3.14;
    public Circle(String color, int radius){
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * PI * this.radius;
    }

}
