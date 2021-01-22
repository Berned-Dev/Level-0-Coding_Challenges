public class task_10 {

    static void getCommonChar(String stringOne, String stringTwo) {

        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();

            for (int j = 0; j < stringOne.length(); j++) {          //Loop uses first string length to iterate throught the charecters of first string.
                for (int i = 0; i < stringTwo.length(); i++) {      //loop uses second string length to iterate throught the charecters of second string.
                    if (stringOneArray[j] == stringTwoArray[i]) {
                        System.out.println(stringOneArray[j]);
                    }
                }
            }
        }

    }
    public static void main(String [] args){
        getCommonChar("computers", "house");
    }
}
