public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a+triangle.b+triangle.c;
    }
}
