package JavaExamples;

public class StaticAtributesExample {
    public static void main(String args[]){
        System.out.println(external.messaje);
        System.out.println(external.numeber);

        external.messaje();
    }
}

class external{
    public static int numeber =1;
    public static String messaje = "Hola";

    public static void messaje(){
        System.out.println("external class message");
    }
}
