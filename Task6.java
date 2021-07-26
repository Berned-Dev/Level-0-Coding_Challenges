public class Task6 {

    static int getMaximumNumber(int numberOne, int numberTwo, int numberThree){

        int results = 0;
        if (numberOne > numberTwo && numberOne > numberThree){
            results = numberOne;
        }
        if (numberTwo > numberOne && numberTwo > numberThree){
            results = numberTwo;
        }
        if (numberThree > numberOne && numberThree > numberTwo){
            results = numberThree;
        }
        if (numberOne == numberTwo && numberTwo == numberThree){
            results = numberOne;
        }
        return results;
    }

    public static void main(String [] args){

        int biggerNumber;
        biggerNumber = getMaximumNumber(56,64, 74);
        System.out.print(biggerNumber);
    }
}