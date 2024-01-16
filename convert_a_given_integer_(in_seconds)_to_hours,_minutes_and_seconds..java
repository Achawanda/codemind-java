import java.util.*;
public class Solution
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt();
        int hours= seconds/3600;
        int remaining_minutes=seconds%3600;
        int minutes=remaining_minutes/60;
        int remaining_seconds=remaining_minutes%60;
        System.out.print("H:M:S-");
        System.out.print(hours);
        System.out.print(":"+minutes);
        System.out.print(":"+remaining_seconds);
    }
}