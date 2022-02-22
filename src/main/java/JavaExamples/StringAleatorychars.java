package JavaExamples;

import java.util.concurrent.ThreadLocalRandom;

public class StringAleatorychars {

    public static String cadenaAleatoria(int Tamaño){

        String finalarray = "";
        String catalogo = "bcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for(int i = 0; i < Tamaño; i++){
            int b  = ThreadLocalRandom.current().nextInt(0,62);
            char letra = catalogo.charAt(b);
            finalarray += letra;
        }

        return finalarray;
    }


    public static void main(String args[]){
        System.out.println(cadenaAleatoria(10));
    }
}
