package JavaExamples;

public class TryCatchExample2 {
    public static void main(String args[]){
        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!
        }catch (Exception e){
            System.out.println("something went worng");
        }
    }
}
