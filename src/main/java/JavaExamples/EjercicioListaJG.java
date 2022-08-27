package JavaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioListaJG {
    public static void main(String args[]){
        //System.out.println("Hola");
        System.out.println("Crear una lista con el nombre LST y almacenar diez numeros enteros positivos");

        List<Integer> lst = new ArrayList<Integer>();
        lst.add(133);
        lst.add(2);
        lst.add(322);
        lst.add(462);
        lst.add(5);
        lst.add(66);
        lst.add(789);
        lst.add(1);
        lst.add(91);
        lst.add(103);

        for(int i=0; i<lst.size();i++){
            System.out.println(lst.get(i));
        }

        System.out.println("Función de ordemiento por incerción");

        Collections.sort(lst);

        for(int i=0; i<lst.size();i++){
            System.out.println(lst.get(i));
        }

    }
}
