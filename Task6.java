public class Task6 {

    static int getMaximumNumber(int numberOne, int numberTwo, int numberThree) {

        int results = 0;
        if (numberOne >= numberTwo && numberOne >= numberThree) {
            results = numberOne;
        }
        else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            results = numberTwo;
        }
        else {
            results = numberThree;
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.print(getMaximumNumber(44, 74, -74));
    }
}