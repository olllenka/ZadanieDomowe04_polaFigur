public class ShapeTester {
    public static void main(String[] args) {

        Square square = new Square(2.0);
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        double squareArea1 = square.squareArea();
        double circleArea1 = circle.circleArea();
        double trianglePerimeter1 = triangle.trianglePerimeter();
        double rectanglePerimeter1 = rectangle.rectPerimeter();

        System.out.println("Pole kwadratu o boku " + square.a + " wynosi: " + squareArea1);
        System.out.println("Pole koła o promieniu " + circle.r + " wynosi: " + circleArea1);
        System.out.println("Obwód trójkąta o bokach: " + triangle.a + ", " + triangle.b + ", " + triangle.c + " wynosi: " + trianglePerimeter1);
        System.out.println("Obwód prostokąta o bokach: " + rectangle.a + ", " + rectangle.b + " wynosi: " + rectanglePerimeter1);

    }
}
