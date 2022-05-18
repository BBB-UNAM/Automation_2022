package JavaExamples;

public class abstractexample2 {
    public static void main(String args[]){
        perro myPerro = new perro();
        myPerro.animalnoise();
        myPerro.sleepnoise();
    }
}

abstract class animals{
    public abstract void animalnoise();
    public void sleepnoise(){
        System.out.println("zzzzzzz");
    }
}

class perro extends animals{
    @Override
    public void animalnoise(){
        System.out.println("guaw");
    }
}
