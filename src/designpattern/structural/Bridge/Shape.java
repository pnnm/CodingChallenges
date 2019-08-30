package designpattern.structural.Bridge;

public abstract class Shape {
    String shapeType;
    int area;

    Colour colorType;
    Shape(Colour colorType){
        this.colorType = colorType;
    }

    public Colour getColorType() {
        return colorType;
    }

    public void setColorType(Colour colorType) {
        this.colorType = colorType;
    }

    public String paintShape(){
        return "shapeType "+shapeType+" painted with "+colorType.fillColor();
    }

    public abstract int computeArea();




}
