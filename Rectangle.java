
import java.lang.Math;
public class Rectangle implements Shape {
    double a,b,c;
    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a*b;
    }
    public double getPerimeter(){
        return a+b+a+b;
    }
}
