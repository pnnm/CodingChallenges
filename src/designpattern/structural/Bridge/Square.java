package designpattern.structural.Bridge;

public class Square extends Shape {
    int sideLength;
    Colour colorType;

    Square(int sd, Colour colorType){
        super(colorType);
        sideLength =sd;
        this.colorType = colorType;
        this.shapeType = "square";
    }

    public int computeArea(){
        return sideLength * sideLength;
    }




}
