import java.util.Scanner;

public class ThunderSound {
    public static void main(String[] args) {
        System.out.println("Введите время после вспышки в секундах:");
        Scanner sc=new Scanner(System.in);
        double time =sc.nextDouble();
        double distance = time*1100;
        System.out.println("Расстояние от молнии: "+distance+" футов.");
    }
}
