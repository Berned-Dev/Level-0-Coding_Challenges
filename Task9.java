public class Task9 {

    static void getVowels(String string){

        char[] stringArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            if (stringArray[i] == 'a' || stringArray[i] == 'A'){
                System.out.print(" a");
            }
            if (stringArray[i] == 'e' || stringArray[i] == 'E'){
                System.out.print(" e");
            }
            if (stringArray[i] == 'i' || stringArray[i] == 'I'){
                System.out.print(" i");
            }
            if (stringArray[i] == 'o' || stringArray[i] == 'O'){
                System.out.print(" o");
            }
            if (stringArray[i] == 'u' || stringArray[i] == 'U'){
                System.out.print(" u");
            }
        }
    }

    public static void main(String [] args){
        getVowels("BeAutIful");
    }
}
