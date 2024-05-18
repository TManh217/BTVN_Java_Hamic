package BTHamicTuan5;

public class Square extends Rectangle {
    //private float side;
    public Square(){
        super();
    }
    public Square(float side,String color){
        super(side,side,color);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(float side){
        this.setLength(side);
        this.setWidth(side);
    }
    @Override
    public String toString(){
        return "Square"+super.toString()+"]";
    }
}
