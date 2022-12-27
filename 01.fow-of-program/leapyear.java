import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        if(num%400==0){
            System.out.println(num + " is a leap year");
        }
        else if(num%4==0){
            System.out.println(num + " is a leap year");
        }
        else System.out.print(num + " is not a leap year");
    }
}