import java.util.Scanner;
import java.lang.Math;
public class Frames
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int X=scan.nextInt();
        int cost=(((N*2)+(M*2))*X);
        System.out.println(cost);
        
    }
}