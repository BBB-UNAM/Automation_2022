package JavaExamples;

import java.util.ArrayList;
import java.util.List;

public class forEachAndListExample {
    public static void main(String args[]){
        List<String> mylist = new ArrayList<String>();

        mylist.add("Hola");
        mylist.add("como");
        mylist.add("Estas");
        mylist.add("el");
        mylist.add("dia");
        mylist.add("De");
        mylist.add("hoy");

        for(int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        for(String cadena: mylist){
            System.out.println(cadena);
        }

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(33);
        numeros.add(66);
        numeros.add(100);

        for(Integer mynums : numeros){
            System.out.println(mynums);
        }


    }
}
