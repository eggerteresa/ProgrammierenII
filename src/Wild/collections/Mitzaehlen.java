package Wild.collections;

import java.util.HashMap;

public class Mitzaehlen {

    private String text;
    private HashMap<String, Integer> wordCount = new HashMap<>();

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }

    public Mitzaehlen(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    //        Beispiel String split: String str = "Hallo Welt";
//        String[] arr = str.split(" "); // Splittet genau da, wo dieses Zeichen hier Leerzeichen
//
//        System.out.println(Arrays.toString(arr));
    public void convertTextToMap() {
        removePunctuation();
        System.out.println(text);
        String[] splitText = text.split(" ");


        for (int i = 0; i < splitText.length; i++) {
            if (wordCount.get(splitText[i]) == null) { // braucht get und put, weil es Hashmap ist
                wordCount.put(splitText[i], 1);

            } else {
                wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
            }

        }
    }

    private void removePunctuation() {
        String newText = " ";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || Character.isLetter(text.charAt(i))) {
                newText += text.charAt(i);
            }
        }
        this.text = newText;
    }
}
//                continue;
//
//            }else if (character.isLetter != true ) {
//                put (SplitText[i] = null);
//                text.replace(",", " ");
//                text.replace(".", " ");
//                text.replace("!", " ");
//                text.replace("?", " ");
//                text.replace(".", " ");
//                text.replace(".", " ");
//                text.replace(".", " ");







 //   }

 // ODER   public void convertTextToMap() {
//        String[] splitText = text.split(" ");
//
//        for (int i = 0; i < splitText.length; i++) {
//            if (wordCount.get(splitText[i]) == null) {
//                wordCount.put(splitText[i], 1);
//
//            } else {
//                wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
//            }
//
//        }
//    }
//}
