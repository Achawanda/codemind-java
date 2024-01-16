import java.util.Scanner;
public class Loss
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double CP=scan.nextDouble();
        double SP=scan.nextDouble();
        double l=(((CP-SP)/CP)*100);
        System.out.printf("%.2f%n",l);
    }
}