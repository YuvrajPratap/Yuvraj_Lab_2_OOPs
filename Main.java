public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red",3);
        System.out.println(circle.calculateArea());
        circle.renderer.draw();

        Triangle triangle = new Triangle("Blue",1,3);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        triangle.renderer.draw();

        Rectangle rectangle = new Rectangle("Green",2,3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a " + rectangle.color + " rectangle");

        Square square = new Square("Orange",5);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        //square.draw();
    }
}