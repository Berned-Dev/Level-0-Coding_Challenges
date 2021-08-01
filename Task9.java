import java.util.ArrayList;

public class Task9 {
    static String getVowels(String string){
        char[] stringArray = string.toCharArray();
        ArrayList<String> vowels = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            if (stringArray[i] == 'a' || stringArray[i] == 'A'){
                vowels.add("a");
            }
            if (stringArray[i] == 'e' || stringArray[i] == 'E'){
                vowels.add("e");
            }
            if (stringArray[i] == 'i' || stringArray[i] == 'I'){
                vowels.add("i");
            }
            if (stringArray[i] == 'o' || stringArray[i] == 'O'){
                vowels.add("o");
            }
            if (stringArray[i] == 'u' || stringArray[i] == 'U'){
                vowels.add("u");
            }
        }
        String vowelsString = "";
        for (int i = 0; i < vowels.size(); i++) {
            if(!(vowelsString.contains(vowels.get(i)))) {
                vowelsString += vowels.get(i);
            }
        }

        String[] splitVowels = vowelsString.split("");
        String finalVowels = "";
        for(int i = 0; i < splitVowels.length; i++){
            finalVowels += splitVowels[i];
            if(i != splitVowels.length-1) {
                finalVowels += ", ";
            }
        }
        return finalVowels;
    }

    public static void main(String [] args){
        System.out.print("Vowels: " + getVowels("Umuzi"));
    }
}