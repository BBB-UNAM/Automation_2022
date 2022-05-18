package JavaExamples;

public class AbstractClassExample {
    public static void main(String args[]){
        pig orzon =  new pig();

        orzon.animalSound();
        orzon.sleep();
    }
}

abstract class animal{
    //this is an abtract method
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzzzzzz");
    }
}

class pig extends animal{
    @Override
    public void animalSound(){
        System.out.println("qui qui qui");
    }

}

