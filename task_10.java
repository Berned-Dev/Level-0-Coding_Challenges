public class task_10 {

    static void getCommonChar(String stringOne, String stringTwo) {

        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();

            for (int j = 0; j < stringTwo.length(); j++) {          //Loop uses first string length to iterate throught the charecters of first string.
                for (int i = 0; i < stringOne.length(); i++) {      //loop uses second string length to iterate throught the charecters of second string.
                    if (stringTwoArray[j] == stringOneArray[i]) {
                        System.out.println(stringOneArray[i]);
                    }
                }
            }

    }
    public static void main(String [] args){
        getCommonChar("house", "computers");
    }
}
