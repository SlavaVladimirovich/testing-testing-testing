import java.util.Scanner;

public class EathWeight_to_MoonWeight {
    public static void main(String[] args) {
        System.out.println("Enter your weight on Earth:");
        Scanner sc=new Scanner(System.in);
        double earthweight = sc.nextInt();
        double moonweight = earthweight/100*17;
        System.out.println("Your Moon weight is "+moonweight);

    }
}
