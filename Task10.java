public class Task10 {

    static void getCommonChar(String stringOne, String stringTwo) {

        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();
        String output = "";

        System.out.print("Common letters: ");

        for (int j = 0; j < stringTwo.length(); j++) {
            for (int i = 0; i < stringOne.length(); i++) {
                if (stringTwoArray[j] == stringOneArray[i]) {
                    output += stringOneArray[i] + ", ";
                }
            }
        }
        StringBuffer newString = new StringBuffer(output);
        newString.deleteCharAt(newString.length()-2);
        System.out.println(newString);
    }

    public static void main(String [] args){
        getCommonChar("house", "computers");
    }
}
