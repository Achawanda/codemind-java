import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double A=sc.nextDouble();
        double B=sc.nextDouble();
        double C=sc.nextDouble();
        double s=((A+B+C)/2);
        double area=Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.printf("%.2f",area);
    }
}