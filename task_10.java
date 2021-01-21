public class task_10 {

    static void getCommonChar(String stringOne, String stringTwo) {

        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();

        if (stringOne.length() > stringTwo.length()){

            for (int j = 0; j < stringOne.length(); j++) {          //Loop uses first string length to iterate throught the charecters of first string.
                for (int i = 0; i < stringTwo.length(); i++) {      //loop uses second string length to iterate throught the charecters of second string.
                    if (stringOneArray[j] == stringTwoArray[i]) {
                        System.out.println(stringOneArray[j]);
                    }
                }
            }
        }

        //Else statement to do the opposite of the above if statement to be able to produce same results even when strings are swaped.
        else {
            for (int j = 0; j < stringTwo.length(); j++) {
                for (int i = 0; i < stringOne.length(); i++) {
                    if (stringTwoArray[j] == stringOneArray[i]) {
                        System.out.println(stringTwoArray[j]);
                    }
                }
            }
        }
    }
    public static void main(String [] args){
        getCommonChar("computers", "house");
    }
}
