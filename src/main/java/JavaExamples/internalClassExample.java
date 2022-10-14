package JavaExamples;

public class internalClassExample {
    public static void main (String args[]){

        //instanciamos la clase externa
        internalClassExample external = new internalClassExample();
        external.message();

        //instanciamos la clase interna
        internalClassExample.myInternalClass internal = external.new myInternalClass();
        internal.message();
    }

    public void message(){
        System.out.println("message for external class");
    }

    class myInternalClass{
        public void message (){
            System.out.println("message for internal class");
        }
    }
}
