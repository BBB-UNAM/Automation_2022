package JavaExamples;

public class HerenciaExampleSuper {

    private String texto1;

    //contructor de esta clase;
    public HerenciaExampleSuper(String cadena){
        this.texto1 = cadena;
        System.out.println("Este es el metodo contructor 1");
    }

    public static void main(String args[]){
        System.out.println("Ejemplo de herencia del metodo contructor");
        TestExample t = new TestExample("Hola");
    }
}

class TestExample extends HerenciaExampleSuper{
    public TestExample (String cad){
        super(cad);
        System.out.println("Este es el metodo contructor 2");
    }
}
