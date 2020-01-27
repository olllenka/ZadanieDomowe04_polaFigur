public class ShapeCalculator {

    double squareArea(Square square){
        return square.a*square.a;
    }

    double circleArea(Circle cirle){
        return 3.14*cirle.r*cirle.r;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a+triangle.b+triangle.c;
    }

    double rectPerimeter(Rectangle rectangle){
        return 2*(rectangle.a+rectangle.b);
    }

    void show(){
        System.out.println();
    }
}
