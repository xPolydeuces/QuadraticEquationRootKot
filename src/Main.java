import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // App counts root of quadratic equation
        Scanner myObj = new Scanner(System.in);
        double aKot = 0;
        while (aKot == 0)
        {
            System.out.println("a mustn't equal 0!");
            System.out.println("a = ");
            aKot = myObj.nextDouble();
        }

        System.out.println("b = ");
        double bKot = myObj.nextDouble();

        System.out.println("c = ");
        double cKot = myObj.nextDouble();

        double deltaKot = Math.pow(bKot, 2) - 4 * aKot * cKot;
        int xKot = 0;

        if (deltaKot > 0)
        {
            xKot = 2;
        }
        if (deltaKot == 0)
        {
            xKot = 1;
        }
        if (deltaKot < 0)
        {
            xKot = 0;
        }

        switch (xKot){
            case 0:
                System.out.println("x doesn't exists");
                break;
            case 1:
                System.out.println("x equals " + (-bKot/2*aKot));
                break;
            case 2:
                System.out.println("x1 equals " + ((-bKot-Math.sqrt(deltaKot))/2*aKot));
                System.out.println("x2 equals " + ((-bKot+Math.sqrt(deltaKot))/2*aKot));
                break;
            default:
                System.out.println("Something is wrong.");
        }

    }
}
