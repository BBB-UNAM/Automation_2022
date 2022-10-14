package JavaExamples;

public class SuperExample {

    public String text1;

    public  SuperExample(String text){
        this.text1 = text;
    }

    public void printText1(){
        System.out.println(this.text1);
    }
    //++++++++++++++++++++++++++++++++++Metodo Main++++++++++++++++++++++++++++++++++
    public static void main(String args[]){
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "app.properties";
        String catalogConfigPath = rootPath + "catalog";
        System.out.println(System.getProperty("user.dir"));

        example object = new example("Este es mi texto");
        object.printText1();
        System.out.println(object.text1);
    }
}

class example extends SuperExample{
    public example(String mytext){
        super(mytext);
    }
}
