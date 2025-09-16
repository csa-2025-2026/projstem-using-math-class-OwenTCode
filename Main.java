import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int N;
        System.out.println("What is your upper bound?");
        N = scan.nextInt();
        printRandom3(N);
    }
    
    public static void printRandom3(int num)
    {
        // Do problem 1 here
        int lowerBound = 2;
        int upperBound = num + 2;
        System.out.println((int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound));
        System.out.println((int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound));
        System.out.println((int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound));

    }
    
    public static double calcSlope(double x11, double x22, double y11, double y22)
    {
        // Do problem 2 here; replace code below
        Scanner firstX = new Scanner(System.in);
        System.out.println("Enter first x-coordinate: " + firstX);

        double x1 = firstX.nextDouble();
    
        Scanner secondX = new Scanner(System.in);
        System.out.println("Enter second x-coordinate: " + secondX);

        double x2 = secondX.nextDouble();

        Scanner firstY = new Scanner(System.in);
        System.out.println("Enter first y-coordinate: " + firstY);

        double y1 = firstY.nextDouble();

        Scanner secondY = new Scanner(System.in);
        System.out.println("Enter Second y-coordinate: " + secondY);

        double y2 = secondY.nextDouble();

        System.out.println("The slope is: " + ((y1 - y2) / (x1 - x2)));
        

        return 0.0;
    }
    
    public static int roundedDist(double a, double b)
    {
        // Do problem 3 here; replace code below


        return 0;
    }
}
