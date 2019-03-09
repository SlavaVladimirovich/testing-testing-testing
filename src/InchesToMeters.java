public class InchesToMeters {
    public static void main(String[] args) {
        double inches, meters, foot;
        int counter;
        counter = 0;
        for (inches = 0; inches <=100 ; inches++) {
            foot=inches/12;
            meters=inches/39.37;
            System.out.println(inches +" дюймам соответствует " +
                    meters +" метров и "+foot+" футам.");
            counter++;
            if (counter == 12){
                System.out.println();
                counter=0;

            }
            
        }
    }
}
