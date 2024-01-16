import java.util.*;
public class Solution
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int years=days/365;
        int remaining_days=days%365;
        int weeks=remaining_days/7;
        System.out.println(years);
        System.out.println(weeks);
    }
}