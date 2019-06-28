// calculator

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimetres(1));
        System.out.println(calcFeetAndInchesToCentimetres(0, 12));
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if ((feet < 0) || inches < 0 || inches > 12) {
            System.out.println("Invalid parameters");
            return -1;
        } else {
            // round answer four digits after point
            long a = (long) ((feet * 30.48 + inches * 2.54) * 10000);
            return (double) a / 10000;
        }
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameters");
            return -1;
        } else {
            double localInchesRemnant = inches % 12;
            double localFeet = Math.round(inches / 12);
            return calcFeetAndInchesToCentimetres(localFeet, localInchesRemnant);
        }
    }
}
