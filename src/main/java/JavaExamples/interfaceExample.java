package JavaExamples;

public class interfaceExample {
    public static void main(String args[]){
        dog myDog = new dog();
        myDog.sleep();
        myDog.animalSound();
    }
}

interface animalsinterface {
    public void sleep();
    public void animalSound();
}

class dog implements animalsinterface {
    @Override
    public void sleep(){
        System.out.println("zzzzzzz");
    }

    @Override
    public void animalSound(){
        System.out.println("guaw");
    }
}
