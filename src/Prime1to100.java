public class Prime1to100 {
    public static void main(String[] args) {
        boolean prostoe = false;

        System.out.println("2");
        System.out.println("3");

        for (int i = 5; i <= 100; i++) {
            for (int delitel = 2; delitel <= Math.sqrt(i); delitel++) {
                prostoe = !(i % delitel == 0);
                if (!prostoe)
                    break;
            }

            if (prostoe)
                System.out.println(i);
        }
            }


    }

