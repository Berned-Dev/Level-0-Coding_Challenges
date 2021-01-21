public class task_6 {

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
        return results;
    }

    public static void main(String [] args){

        int biggerNumber;
        biggerNumber = getMaximumNumber(56,78, 14);
        System.out.print(biggerNumber);
    }
}












