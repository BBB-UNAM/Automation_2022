package JavaExamples;

public class superExample2 {
    String texto;
    public superExample2(String myText){
        this.texto = myText;
    }


    public static void main(String args[]){
        sonClass myclass = new sonClass("Super Example");
        myclass.printMesageFromFather();
        myclass.printMesageFromclass();
    }
}

class sonClass extends superExample2{

    String textt;
    sonClass(String myText2){
        super(myText2);
        this.textt = myText2;
    }

    public void printMesageFromFather(){
        System.out.println(texto + " father class");
    }
    public void printMesageFromclass(){
        System.out.println(this.textt + " Local class");
    }
}