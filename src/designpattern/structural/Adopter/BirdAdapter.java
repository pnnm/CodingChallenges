package designpattern.structural.Adopter;

public class BirdAdapter implements Bird{
    private PlasticToyBird p;

    public BirdAdapter(PlasticToyBird p){
        this.p = p;
    }

   public void makeSound(){
        this.p.squeek();
   }

}
