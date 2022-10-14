package JavaExamples;

public class staticClassExample {
    public static void main(String args[]){
        //staticClassExample external = new staticClassExample();
        staticClassExample.myClass.message();
    }
    public static class myClass{
        public static void message(){
            System.out.println("Static class message");
        }
    }
}

