public class Task6 {


    static int getMaximumNumber(int numberOne, int numberTwo, int numberThree) {

        int results = 0;
        if (numberOne > numberTwo && numberOne > numberThree) {
            results = numberOne;
        }
        if (numberTwo > numberOne && numberTwo > numberThree) {
            results = numberTwo;
        }
        if (numberThree > numberOne && numberThree > numberTwo) {
            results = numberThree;
        }
        if (numberOne == numberTwo && numberTwo == numberThree) {
            results = numberOne;
        }
        if (numberOne < 0) {
            results = Math.max(numberTwo, numberThree);
        }
        if (numberTwo < 0) {
            results = Math.max(numberOne, numberThree);
        }
        if (numberThree < 0) {
            results = Math.max(numberTwo, numberOne);
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.print(getMaximumNumber(-74, -74, 74));
    }
}