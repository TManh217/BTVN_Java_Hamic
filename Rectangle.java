package BTHamicTuan5;

public class Rectangle {
    private float length,width;
    private String color;
    public Rectangle(){

    }

    public Rectangle(float length,float width,String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString(){
        return "Rectangle[Length="+length+";Width="+width+";Color="+color+";Area="+this.getArea()+";Perimeter="+this.getPerimeter()+"]";

    }

    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width)
{
    this.width = width;
}    

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

}
