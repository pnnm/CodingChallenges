package designpattern.structural.Adopter;

public class Client {

    public static void main(String[] args){
         Bird b = new Duck();
         b.makeSound();

         Bird b1 = new BirdAdapter(new CatToy());
         b1.makeSound();

    }
}
/*
the object allows incompatible interfaces to collaborate
Here client tightly binded with Bird but client needs plasticBirds sound also
 */