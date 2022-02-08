package JavaExamples;

import java.util.ArrayList;
import java.util.List;

public class listsExample {
    public static void main(String args[]){
        List<String> myList = new ArrayList<>();

        myList.add("Alberto");
        myList.add("Daniel");
        myList.add("Picasso");
        myList.add("Gonzalez");

        System.out.println(myList.get(3));
        System.out.println(myList.size());
    }
}
