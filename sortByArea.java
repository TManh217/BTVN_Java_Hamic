package BTHamicTuan5;
import java.io.*;
import java.lang.*;
import java.util.*;

class SortByArea implements Comparator<Rectangle> {
    public int compare(Rectangle a,Rectangle b){
        if (a.getArea() > b.getArea()) return 1;
        else if (a.getArea() == b.getArea()) return 0;
        else return -1;
    }
}
class SortByPerimeter implements Comparator<Rectangle>{
    public int compare(Rectangle a,Rectangle b){
        if (a.getPerimeter() > b.getPerimeter()) return 1;
        else if (a.getPerimeter() == b.getPerimeter()) return 0;
        else return -1;
    }
}
