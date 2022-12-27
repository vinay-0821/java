import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        }
        else System.out.print(num + " is odd");
    }
}