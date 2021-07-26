import java.lang.Math;

public class Task5 {

    static double getAreaOfTriangle(int sideA, int sideB, int sideC){
        int semiPerimenter;
        double area;
        semiPerimenter = (sideA + sideB + sideC)*1/2;
        area = Math.sqrt( semiPerimenter * (( semiPerimenter-sideA) * ( semiPerimenter- sideB) *( semiPerimenter-sideC)));
        return area;
    }

    public static void main(String [] args){
        System.out.println(getAreaOfTriangle(3,4,5));
    }
}