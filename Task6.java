import java.util.ArrayList;

public class Task6 {

    static int getMaximumNumber(int numberOne, int numberTwo, int numberThree){
        ArrayList<Integer> numberList = new ArrayList<>();
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
        if (numberOne < 0){
            if(numberTwo > numberThree){
                results = numberTwo;
            }
            else {
                results = numberThree;
            }
        }
        if (numberTwo < 0){
            if(numberOne > numberThree){
                results = numberOne;
            }
            else {
                results = numberThree;
            }
        }
        if (numberThree < 0){
            if(numberTwo > numberOne){
                results = numberTwo;
            }
            else {
                results = numberOne;
            }
        }
        return results;
    }

    public static void main(String [] args){
        System.out.print(getMaximumNumber(-74,-74, 74));
    }
}