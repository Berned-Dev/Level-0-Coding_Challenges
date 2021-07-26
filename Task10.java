public class Task10 {

    static void getCommonChar(String stringOne, String stringTwo) {

        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();

        System.out.print("Common letters: ");
            for (int j = 0; j < stringTwo.length(); j++) {    
                
                for (int i = 0; i < stringOne.length(); i++) {  
                    if (stringTwoArray[j] == stringOneArray[i]) {
                        System.out.print(stringOneArray[i] + ", ");
                    }
                }
            }
    }
    public static void main(String [] args){
        getCommonChar("house", "computers");
    }
}