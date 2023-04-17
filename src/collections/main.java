package collections;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        String str = "Hallo Welt";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String str2 = "Hallo welt der die das, Hallo Hallo und Hallo Welt";
       Mitzaehlen wordcount = new Mitzaehlen(str2);
       wordcount.convertTextToMap();
        System.out.println(wordcount.getWordCount());

//      wordcount.convertTextToMap();
//        System.out.println(wordcount.getWordCount());



    }


}
