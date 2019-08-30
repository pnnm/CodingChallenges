package designpattern.structural.Bridge;

public class Client {

    public static void main(String args[]){
        GreenColor greenColor = new GreenColor();
        RedColor redColor = new RedColor();
        Shape square = new Square(5, greenColor);
        System.out.println(square.paintShape());

        square.setColorType(redColor);
        System.out.println(square.paintShape());

        Shape rectangle = new RectAngle(2,3,greenColor);
        System.out.println(rectangle.paintShape());


    }
}

/**
 * Bridge pattern decouple the abstraction from its implementation and the two vary independently
 */