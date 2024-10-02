import java.util.Scanner;
import java.util.Random;

public class guess_the_number{

    void easy(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int num = rand.nextInt(10);
        int score = 10;
        System.out.println("Enter Your Answer");
        int number = scan.nextInt();
        if(number == num)
        {
            System.out.println("Congratulations! Your Answer Is correct");
        }
        else
        {
            System.out.println("Try Again Next Time");
            easy();
        }

    }
    void Normal(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int num = rand.nextInt(25);
        int score = 10;
        System.out.println("Enter Your Answer");
        int number = scan.nextInt();
        if(number == num)
        {
            System.out.println("Awesome! Your Answer Is correct");
        }
        else
        {
            System.out.println("Try Again Next Time");
            Normal();
        }
    }
    void hard(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int num = rand.nextInt(50);
        int score = 10;
        System.out.println("Enter Your Answer");
        int number = scan.nextInt();
        if(number == num)
        {
            System.out.println("Excellent! Your Answer Is correct");
        }
        else
        {
            System.out.println("Try Again Next Time");
            hard();
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Find The Random Number");
        System.out.println("Choose Your Level");
        System.out.println("Enter 1--Easy   2--Normal  3--High");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                guess_the_number obj = new guess_the_number();
                obj.easy() ;
                break;
            case 2:
            	guess_the_number obj1 = new guess_the_number();
                obj1.Normal() ;
                break;
            case 3:
            	guess_the_number obj2 = new guess_the_number();
                obj2.hard();
                break;
            default:
                System.out.println("Enter onlyb Valid Values");
                break;
        }
    }
}
