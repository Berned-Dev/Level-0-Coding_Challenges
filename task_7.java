public class task_7 {

    static double getFahrenheitTemp(double temperatureCelsius){
        double fahrenheitTemperature;
        fahrenheitTemperature = (temperatureCelsius * 9/5) * 32;
        return fahrenheitTemperature;
    }

    static double getCelsiusTemp(double temperatureFahrenheit){
        double celsiusTemperature;
        celsiusTemperature = (temperatureFahrenheit - 32) * 5/9;
        return celsiusTemperature;
    }

    public static void main (String [] args){
        System.out.println(getFahrenheitTemp(5));
        System.out.println(getCelsiusTemp(40));
    }
}
