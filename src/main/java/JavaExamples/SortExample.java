package JavaExamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String args[]){
        List<Integer> mylist = Arrays.asList(2,22,11,1,4,3,7,21);
        Collections.sort(mylist);
        System.out.println(mylist);
    }
}


