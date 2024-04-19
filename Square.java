

public class Square implements Shape {
    private double length;
    public Square(double length){
        this.length=length;
    }
    public double getPerimeter(){
        return this.length*4;
    }
    public double getArea(){
        return this.length*this.length;
    }
}
