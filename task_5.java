import java.lang.Math;

public class task_5 {
    static double getAreaOfTriangle(int SideA, int SideB, int SideC){

        int semiperimenter;
        double area;
        semiperimenter = (SideA + SideB + SideC)*1/2;
        area = Math.sqrt( semiperimenter * (( semiperimenter-SideA) * ( semiperimenter-SideB) *( semiperimenter-SideC)));

        return area;
    }

    public static void main(String [] args){
        System.out.println(getAreaOfTriangle(3,4,5));
    }
}
