public class task_8 {

    static void getHoursAndMinutes(int number){

        int hours = 0;
        int minutes = 0;

        while (number >= 60){
            number -= 60;
            minutes = number;
            ++hours;
        }

        if (hours == 1 && minutes == 1){
            System.out.println(hours + " Hour, " + minutes + " minute");
        }
        if (hours == 1 && minutes != 1){
            System.out.println(hours + " Hour, " + minutes + " minutes");
        }
        if (hours != 1 && minutes == 1){
            System.out.println(hours + " Hours, " + minutes + " minute");
        }
        if (hours != 1 && minutes != 1){
            System.out.println(hours + " Hours, " + number + " minutes" );
        }
 
    }

    public static void main(String [] args){
        getHoursAndMinutes(133);
    }
}
