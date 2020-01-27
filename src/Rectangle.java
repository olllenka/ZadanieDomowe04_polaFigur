public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double rectPerimeter(Rectangle rectangle){
        return 2*(rectangle.a+rectangle.b);
    }
}
