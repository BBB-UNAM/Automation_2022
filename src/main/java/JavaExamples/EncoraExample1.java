package JavaExamples;

public class EncoraExample1 {
    public static void main(String args[]){

        EncoraExample1 test = new EncoraExample1();

        int[] array = {-1,-3};
        System.out.println(test.solution(array));

    }

    public int solution(int[] A){
        int counter = 1;
        boolean flag1 = false;
        boolean flag2 = true;

        while (flag2 == true){

            for(int i = 0;i < A.length;i++){
                if(counter == A[i]){
                    flag1 = true;
                    break;
                }
            }

            if(flag1 == true){
                counter++;
                flag1 = false;
            } else {
                flag2 = false;
            }
        }
        return counter;
    }
}
