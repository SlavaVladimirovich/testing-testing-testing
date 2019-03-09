import java.util.Scanner;

public class GallonsToLittres {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter an amount of gallons.");
            double littres;
            double gallons;
            Scanner sc = new Scanner(System.in);
            gallons = sc.nextDouble();
            littres = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + littres + " littres");

        }
    }
}
