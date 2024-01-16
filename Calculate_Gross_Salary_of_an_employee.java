import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double Salary=sc.nextDouble();
        double HRA=sc.nextDouble();
        double DA=sc.nextDouble();
        double PF=(0.12*Salary);
        double Gross_Salary=Salary+HRA+DA+PF;
        System.out.printf("%.2f%n",PF);
        System.out.printf("%.2f%n",Gross_Salary);
        }
}