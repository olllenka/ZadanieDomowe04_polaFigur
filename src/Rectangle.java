public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double rectPerimeter(){
        return 2*(a+b);
    }
}
