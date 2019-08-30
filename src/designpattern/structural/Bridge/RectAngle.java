package designpattern.structural.Bridge;


public class RectAngle extends Shape{

    int length;
    int width;

    RectAngle(int l, int w, Colour colour){
        super(colour);
        length = l;
        width = w;
        shapeType = "rect angle";

    }
    @Override
    public int computeArea() {
        return length*width;
    }


}
